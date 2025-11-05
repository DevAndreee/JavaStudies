package POO.inheritance.modifiers;


 * ==========================================================
 *                 INHERITANCE - FINAL METHOD
 * ==========================================================
 *
 * CONCEPT INTRODUCTION
 * ----------------------------------------------------------
 * A method declared with the keyword 'final' cannot be overridden 
 * by any subclass.
 * 
 * Using 'final' on methods ensures that the specific behavior of 
 * that method remains intact in the entire class hierarchy.
 *
 * This is useful to protect critical functionality or prevent 
 * accidental modification.
 

// ==================== EXAMPLE ====================
class Vehicle {
    public final void startEngine() {
        System.out.println("Engine is starting...");
    }

    public void honk() {
        System.out.println("Beep beep!");
    }
}

class Car extends Vehicle {
    // ❌ Compilation error: cannot override final method startEngine()
    // @Override
    // public void startEngine() { System.out.println("Car engine starts"); }

    @Override
    public void honk() {
        System.out.println("Car horn: Honk Honk!");
    }
}

public class InheritanceFinalMethod {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.startEngine();
        v.honk();

        Car c = new Car();
        c.startEngine(); // final method still works
        c.honk();        // overridden method
    }
}


 * ==========================================================
 * EXPLANATION
 * ----------------------------------------------------------
 * 1. FINAL METHOD CHARACTERISTICS:
 *    - Cannot be overridden by subclasses.
 *    - Can be inherited and called as normal.
 *    - Protects important behavior from accidental changes.
 *
 * 2. WHY USE FINAL METHODS:
 *    ✅ Ensures reliability and consistent behavior across subclasses.
 *    ✅ Avoids errors in class hierarchies by locking critical methods.
 *    ✅ Can improve performance by allowing compiler optimizations.
 *
 * 3. RELATION WITH FINAL CLASS:
 *    - A final class automatically makes all its methods effectively final 
 *      because the class cannot be subclassed.
 *
 * ----------------------------------------------------------
 * QUICK REFERENCE
 * ----------------------------------------------------------
 * final void myMethod()   → cannot be overridden
 * @Override               → optional, indicates explicit overriding
 * subclass.myMethod()     → allowed call, but not override
 *
 * ----------------------------------------------------------
 * COMMON MISTAKES
 * ----------------------------------------------------------
 * - Trying to override a final method → compilation error
 * - Assuming final method cannot be called → false; it can be used normally
 * - Confusing final method with private method → private methods are also non-overridable, but scope differs
 *
 * ----------------------------------------------------------
 * LEARN MORE
 * ----------------------------------------------------------
 * 🔗 https://docs.oracle.com/javase/tutorial/java/IandI/final.html
 * 🔗 https://docs.oracle.com/javase/tutorial/java/javaOO/inheritance.html
 