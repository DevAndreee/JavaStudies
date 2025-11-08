
A C C E S S   M O D I F I E R S   B A S I C S

In Java, access modifiers control the visibility and accessibility of classes,
methods, and attributes. They are a key part of **encapsulation**, one of the main
pillars of Object-Oriented Programming (OOP).

Main access levels:

1. public
   - Accessible from anywhere in the project (and from external packages if imported).
   - Example: Classes in the Java API, like java.util.ArrayList.

2. private
   - Accessible only inside the same class.
   - Used to protect internal data and enforce encapsulation.

3. default (package-private)
   - If no modifier is written, access is restricted to the same package.
   - Example: Classes in the same folder (package) can access it.

4. protected
   - Accessible inside the same package (like default),
     and also from subclasses in different packages.
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

        // Direct access examples:
        System.out.println(ex.publicVar);    // ✅ Accessible (public)
        // System.out.println(ex.privateVar); // ❌ Error: private (only inside ExampleClass)
        System.out.println(ex.defaultVar);   // ✅ Same package
        System.out.println(ex.protectedVar); // ✅ Same package (also visible to subclasses)
    }
}


EXPLANATION:
- Access modifiers define how other parts of the program can interact with a class.
- Choosing the correct modifier enforces **encapsulation** and prevents unintended dependencies.
- "private" hides internal details; "public" exposes APIs; "protected" allows inheritance flexibility.

QUICK REFERENCE (simplified view):

  public      → all classes, all packages
  protected   → same package + subclasses
  default     → only same package
  private     → only same class

COMMON MISTAKES:
- Thinking “protected” works like “public” for subclasses — it doesn’t apply to unrelated classes.
- Forgetting that “default” access is package-limited.
- Making everything “public”, breaking encapsulation.

LEARN MORE:
- Official docs: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
- Effective Java (Joshua Bloch): Item 15 – "Minimize the accessibility of classes and members"
*/