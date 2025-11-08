
A C C E S S   M O D I F I E R :   P U B L I C  
The "public" modifier allows a class, method, or attribute to be accessed from anywhere — even outside its package if imported.  
Commonly used for APIs, libraries, and entry points like the `main` method.  


package POO.AccessModifiers;

public class AccessModifiersPublic {

    public String name = "Accessible everywhere";

    public void sayHello() {
        System.out.println("Hello! You can call me from anywhere.");
    }

    public static void main(String[] args) {
        AccessModifiersPublic obj = new AccessModifiersPublic();
        System.out.println(obj.name);
        obj.sayHello();
    }
}


EXPLANATION:
- `public` grants universal access — other classes, packages, or even external projects can interact with it.
- Only one `public` class is allowed per .java file, and the file name must match that class name.
- A `public` method or field can be used by any code that has access to the class.

Example:
  public class MyClass {
      public void printMessage() {
          System.out.println("Accessible anywhere");
      }
  }

  // In another package
  MyClass obj = new MyClass();
  obj.printMessage();  // Works fine

QUICK REFERENCE:
Syntax:
  public class ClassName { ... }
  public returnType methodName() { ... }
  public dataType variableName;

COMMON MISTAKES:
- Having more than one `public` class in the same file → compilation error.
- Forgetting to name the file the same as the `public` class.
- Declaring internal helpers as `public` unnecessarily (use `private` or `protected` when appropriate).

LEARN MORE:
- Java Language Specification: https://docs.oracle.com/javase/specs/
- Official Access Modifiers Guide: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html