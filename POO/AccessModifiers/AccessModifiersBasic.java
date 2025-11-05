/*
 Access Modifiers Basics

 In Java, access modifiers control the visibility and accessibility of classes, methods, and attributes.
 They are a fundamental part of encapsulation, one of the main pillars of OOP.

 Main levels of access:

 1. public
    - Accessible from anywhere in the project (and from other projects if imported).
    - Example: Classes in the Java API (e.g., java.util.ArrayList).

 2. private
    - Accessible only inside the same class.
    - Used to protect internal details and maintain encapsulation.

 3. default (also called package-private)
    - If no modifier is written, the member is accessible only within the same package.
    - Example: A class in the same folder (package) can access it.

 4. protected
    - Accessible inside the same package (like default).
    - Additionally, it is accessible from subclasses, even if they are in different packages.

 Why are they important?
 - They define how "open" or "closed" a class design is.
 - They protect code from unwanted use.
 - They allow building APIs safely.

 Example overview:
*/

package POO.AccessModifiers;

class ExampleClass {
    public int publicVar = 1;       // Accessible everywhere
    private int privateVar = 2;     // Only inside this class
    int defaultVar = 3;             // Accessible only in this package
    protected int protectedVar = 4; // Accessible in package + subclasses

    public void showVars() {
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
    }
}

public class AccessModifiersBasic {
    public static void main(String[] args) {
        ExampleClass ex = new ExampleClass();
        ex.showVars();

        // What can we access directly here?
        System.out.println(ex.publicVar);   // ✅ Works
        System.out.println(ex.privateVar);   // ❌ Error: private
        System.out.println(ex.defaultVar);  // ✅ Works: same package
        System.out.println(ex.protectedVar);// ✅ Works: same package
        
    }
}