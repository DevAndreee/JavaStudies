
A C C E S S   M O D I F I E R :   P R O T E C T E D
The "protected" modifier allows access:
1. Inside the same package (like default access).
2. In subclasses, even if they are in DIFFERENT packages.

Used mainly in inheritance — to allow child classes to reuse or modify behavior safely.


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

        // dog.name;        // ❌ Not accessible directly here, because it's protected
        // dog.makeSound(); // ❌ Not accessible here, only inside Dog or Animal
    }
}


EXPLANATION:
- `protected` strikes a balance between `private` and `public`.
- Members are visible to all classes in the same package and to subclasses in other packages.
- Useful when designing base classes that will be extended by others.

Example:
  class Parent {
      protected int value = 10;
  }

  class Child extends Parent {
      void showValue() {
          System.out.println(value); // ✅ Accessible here
      }
  }

  // But not accessible from unrelated external classes.

QUICK REFERENCE:
Syntax:
  protected type variableName;
  protected returnType methodName() { ... }

Visibility:
  - Same package ✅
  - Subclasses in other packages ✅
  - Unrelated classes ❌

COMMON MISTAKES:
- Assuming `protected` is the same as `public` — it’s not.
- Trying to access a `protected` member from an instance in another package without inheritance.
- Overusing `protected` instead of proper encapsulation (`private` + getter/setter).

LEARN MORE:
- Java Access Control Docs: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
- Oracle Inheritance Guide: https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html