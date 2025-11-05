package POO.inheritance.modifiers;


 * ==========================================================
 *                 INHERITANCE - FINAL CLASS
 * ==========================================================
 *
 * CONCEPT INTRODUCTION
 * ----------------------------------------------------------
 * A class declared with the keyword 'final' cannot be extended.
 * 
 * In other words, once a class is marked as final:
 *   - No subclass can inherit from it.
 *   - All of its behavior is locked and cannot be changed 
 *     through inheritance.
 *
 * This is useful when designing classes that must remain stable,
 * secure, or immutable.
 

// ==================== EXAMPLE ====================
final class Vehicle {
    private final String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public void showType() {
        System.out.println("Vehicle type: " + type);
    }
}

// ❌ Compilation error: cannot inherit from final class
// class Car extends Vehicle {}

public class InheritanceFinalClass {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Electric");
        v1.showType();

        // Vehicle cannot be subclassed, so its implementation
        // remains exactly as designed by the developer.
    }
}


 * ==========================================================
 * EXPLANATION
 * ----------------------------------------------------------
 * 1. FINAL CLASS CHARACTERISTICS:
 *    - Prevents inheritance (cannot create subclasses).
 *    - Used to protect implementation from being modified.
 *    - Common in immutable and security-sensitive classes
 *      such as java.lang.String or java.lang.Math.
 *
 * 2. WHY USE FINAL CLASSES:
 *    ✅ Ensures design stability and predictable behavior.
 *    ✅ Prevents subclass misuse or accidental overrides.
 *    ✅ Enables potential compiler optimizations.
 *
 * ----------------------------------------------------------
 * QUICK REFERENCE
 * ----------------------------------------------------------
 * final class MyClass { ... }  → cannot be extended
 * new MyClass()                → allowed
 * class MySubclass extends MyClass → ❌ not allowed
 *
 * ----------------------------------------------------------
 * COMMON MISTAKES
 * ----------------------------------------------------------
 * - Trying to extend a final class → compilation error.
 * - Assuming final class means immutable → not always true.
 *   (Fields must also be final for true immutability.)
 * - Declaring final unnecessarily → reduces flexibility.
 *
 * ----------------------------------------------------------
 * LEARN MORE
 * ----------------------------------------------------------
 * 🔗 https://docs.oracle.com/javase/tutorial/java/IandI/final.html
 * 🔗 https://docs.oracle.com/javase/tutorial/java/javaOO/inheritance.html
 */