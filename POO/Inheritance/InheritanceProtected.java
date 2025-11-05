
The 'protected' access modifier in inheritance allows a member (attribute or method) 
to be accessible within:
- The same class;
- Subclasses (even in different packages);
- Classes in the same package.

It's commonly used when you want subclasses to have direct access to parent attributes 
or methods, but still hide them from unrelated classes.


// Parent class with protected members
class Animal {
    protected String species;  // Accessible by subclasses
    private int age;           // NOT accessible by subclasses

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    protected void makeSound() {  // Protected method - subclasses can access
        System.out.println("Some generic animal sound");
    }

    public int getAge() {  // Public method to access private field
        return age;
    }
}

// Subclass can directly access 'protected' members from Animal
class Dog extends Animal {
    private String name;

    public Dog(String name, int age) {
        super("Canine", age);  // Call parent constructor
        this.name = name;
    }

    public void showInfo() {
        // Direct access to 'species' because it's protected
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);  // ✅ Allowed - protected field
        System.out.println("Age: " + getAge());     // Must use getter - age is private
    }

    @Override
    protected void makeSound() {
        // Can override protected method
        System.out.println(name + " says: Woof!");
    }

    public void callParentSound() {
        // Can call protected parent method
        super.makeSound();
    }
}

public class InheritanceProtected {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 5);
        
        dog.showInfo();
        System.out.println("---");
        
        dog.makeSound();         // Calls overridden version
        dog.callParentSound();   // Calls parent's protected method
        
        System.out.println("---");
        
        // ❌ CANNOT do this from unrelated class:
        // System.out.println(dog.species);  // Compilation error
        // dog.makeSound() is accessible only because Dog made it public through inheritance
    }
}


===== EXPLANATION =====

1. 'protected' → access modifier that provides package-level + subclass access
   - More restrictive than 'public'
   - Less restrictive than 'private' or default (package-private)
   - Allows subclasses to access and use parent members directly

2. Access rules for protected members:
   - ✅ Same class → full access
   - ✅ Subclass (any package) → full access
   - ✅ Same package (any class) → full access
   - ❌ Unrelated class in different package → NO access

3. Common use cases:
   ✅ When subclasses need direct access to parent fields (avoiding getters)
   ✅ When you want to provide a method for subclasses to override
   ✅ When building class hierarchies where children extend functionality
   ❌ NOT for completely hiding implementation details (use private instead)

4. Important: Protected members can be accessed directly in subclass code, 
   but from outside code, they behave like private members.

---

📌 QUICK REFERENCE:
protected attribute → accessible in subclasses and same package
protected method()  → can be overridden and called by subclasses
super.protectedMember → explicitly access parent's protected member

---

⚠️ COMMON MISTAKES:
- Confusing 'protected' with 'public' → protected is NOT accessible everywhere
- Using 'protected' for everything → breaks encapsulation; use when subclasses truly need access
- Forgetting package access → protected also allows access within the same package (not just subclasses)
- Trying to access protected members from unrelated classes → compilation error

---

Learn more:
🔗 https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
(Section: "Access Levels")
