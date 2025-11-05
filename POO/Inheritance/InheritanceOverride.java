
Method overriding happens when a subclass redefines a method 
inherited from its superclass, keeping the same signature 
(name, return type, and parameters).

The goal is to modify the method’s behavior to fit 
the subclass’s needs, without changing the superclass code.


class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    // Here the makeSound() method is overridden
    @Override
    public void makeSound() {
        System.out.println(name + " is barking: Woof Woof!");
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Creature");
        animal1.makeSound();

        System.out.println("-------------------");

        Dog dog1 = new Dog("Rex");
        dog1.makeSound();
    }
}


===== EXPLANATION =====

1. 'Override' → indicates that the method is being redefined in the subclass.
   It is an annotation that:
   - Ensures the method actually exists in the superclass;
   - Prevents typing errors (like changing the name unintentionally);
   - Makes the code more readable and safe.

2. Rules for overriding methods:
   ✅ Same method name;
   ✅ Same return type;
   ✅ Same parameters (same signature);
   ✅ Equal or more permissive access level (e.g., public can replace protected).

3. The overridden method replaces the original behavior 
   only for subclass objects.

Learn more:
🔗 https://docs.oracle.com/javase/tutorial/java/IandI/override.html  
(Section: "Overriding and Hiding Methods")
