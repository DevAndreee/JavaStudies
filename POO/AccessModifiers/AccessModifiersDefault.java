
A C C E S S   M O D I F I E R :   D E F A U L T  ( P A C K A G E - P R I V A T E )

When no modifier is specified, Java applies the "default" (package-private) access level.

It allows access **only within the same package**, making it ideal for 
internal collaboration between related classes without exposing details 
to external packages.
*/

package POO.AccessModifiers;

class DefaultClass {
    String message = "Accessible only within the same package";

    void showMessage() {
        System.out.println(message);
    }
}

public class AccessModifiersDefault {
    public static void main(String[] args) {
        DefaultClass obj = new DefaultClass();
        obj.showMessage();  // ✅ Works, because we are in the same package
    }
}


EXPLANATION:
- When no access modifier is defined, members have *package-private* access.
- They can be accessed by any class in the same package, but not from other packages.
- Useful for grouping related classes that work together internally.

Example:
  // File: animals/Dog.java
  class Dog { void bark() { System.out.println("Woof!"); } }

  // File: animals/Zoo.java
  class Zoo {
      public static void main(String[] args) {
          Dog dog = new Dog();
          dog.bark(); // ✅ Same package
      }
  }

QUICK REFERENCE:
Syntax:
  type variableName;  // no modifier = package-private
  returnType methodName() { ... }

Visibility:
  - Same class ✅
  - Same package ✅
  - Subclasses in another package ❌
  - External classes ❌

COMMON MISTAKES:
- Assuming "default" means public (it does NOT).
- Forgetting that classes in other packages cannot access these members.

LEARN MORE:
- Access Control in Java: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
*/