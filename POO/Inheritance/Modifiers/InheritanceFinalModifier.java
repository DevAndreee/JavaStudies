
The 'final' modifier in Java restricts modification or extension.

It can be applied to:
1️⃣ Variables → value cannot be changed once assigned.
2️⃣ Methods → cannot be overridden in subclasses.
3️⃣ Classes → cannot be inherited (no subclasses allowed).

Using 'final' ensures immutability, stability, and prevents unwanted changes
in object-oriented hierarchies.


// ====== EXAMPLE: final variable ======
class Constants {
    public static final double PI = 3.14159;

    public void showConstant() {
        System.out.println("The value of PI is: " + PI);
        // PI = 3.14; // ❌ Compilation error: cannot assign a value to final variable
    }
}

// ====== EXAMPLE: final method ======
class Vehicle {
    protected String brand = "Generic";

    public final void startEngine() {
        System.out.println("Engine started (from Vehicle)");
    }

    public void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Subclass attempting to override final method
class Car extends Vehicle {
    // ❌ Error if uncommented: cannot override final method
    // public void startEngine() { 
    //     System.out.println("Engine started (from Car)");
    // }
}

// ====== EXAMPLE: final class ======
final class Utility {
    public static void printMessage() {
        System.out.println("Utility class: cannot be inherited.");
    }
}

// ❌ Error if uncommented: cannot inherit from final class
// class ExtendedUtility extends Utility {}

public class FinalModifier {
    public static void main(String[] args) {
        // final variable demonstration
        Constants c = new Constants();
        c.showConstant();

        System.out.println("----------------");

        // final method demonstration
        Car car = new Car();
        car.startEngine();
        car.showBrand();

        System.out.println("----------------");

        // final class demonstration
        Utility.printMessage();
    }
}


===== EXPLANATION =====

1. final variables:
   - Once initialized, their value cannot change.
   - Often used for constants (usually in uppercase).
   - Must be assigned either at declaration or in the constructor.

2. final methods:
   - Cannot be overridden by subclasses.
   - Helps preserve specific behavior (e.g., critical logic or security-sensitive operations).
   - Still can be called by subclasses normally.

3. final classes:
   - Cannot be extended by any subclass.
   - Typically used for utility or immutable classes (e.g., java.lang.String, java.lang.Math).

4. When to use 'final':
   ✅ When defining constants
   ✅ When preventing subclass modification
   ✅ When ensuring class immutability or security
   ✅ When enforcing predictable behavior in inheritance

---

📌 QUICK REFERENCE:
final variable → cannot be reassigned
final method   → cannot be overridden
final class    → cannot be extended
Typical use    → constants, immutability, stable APIs

---

⚠️ COMMON MISTAKES:
- Declaring a final variable without assigning a value → causes compile error
- Trying to override a final method → compile-time error
- Attempting to extend a final class → compile-time error
- Forgetting that primitives and objects behave differently:
  final int x = 10; → cannot change x
  final List l = new ArrayList<>(); → cannot reassign l, but can modify its contents

---

Learn more:
🔗 https://docs.oracle.com/javase/tutorial/java/IandI/final.html
(Section: "Final Variables, Methods, and Classes")
