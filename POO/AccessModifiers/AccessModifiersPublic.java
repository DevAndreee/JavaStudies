/*
 Access Modifier: public

 The "public" modifier makes a class, method, or attribute accessible from anywhere in the project
 and even outside the project (if the package is imported).

 Main rules:
 - A "public" class can be accessed from any other package.
 - A "public" method or attribute can be accessed by any code that sees the class.
 - Only one "public" class is allowed per file, and the file name must match that class name.

 Example: java.util.Scanner is a public class → we can import and use it directly.

 When to use?
 - When a class, method, or attribute should be open for general use.
 - Often used for APIs, utility classes, or entry points (like the "main" method).
*/

package POO.AccessModifiers;

// A public class → can be accessed from anywhere
public class AccessModifiersPublic {

    // A public attribute
    public String name = "Accessible everywhere";

    // A public method
    public void sayHello() {
        System.out.println("Hello! You can call me from anywhere.");
    }

    public static void main(String[] args) {
        AccessModifiersPublic obj = new AccessModifiersPublic();
        System.out.println(obj.name); // Direct access
        obj.sayHello();               // Calling the public method
    }
}