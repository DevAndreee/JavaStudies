/*
 Access Modifier: protected

 Rules:
 - Members with "protected" access are visible:
   1. Inside the same package (like default).
   2. In subclasses, even if they are in DIFFERENT packages.

 Why use it?
 - To allow controlled extension: subclasses can access certain details,
   while keeping them hidden from unrelated classes.
 - Common in inheritance hierarchies (e.g., frameworks, abstract classes).

 Remember:
 - "protected" is less strict than "private",
   but more restricted than "public".
*/

package POO.AccessModifiers;

class Animal {
    protected String name;

    protected void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        this.name = name;  // ✅ Accessible because of "protected"
    }

    public void bark() {
        makeSound();  // ✅ Accessible in subclass
        System.out.println(name + " says: Woof!");
    }
}

public class AccessModifiersProtected {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        dog.bark();

        // dog.name;       // ❌ Not accessible directly here, because it's protected
        // dog.makeSound(); // ❌ Not accessible here, only inside Dog or Animal
    }
}