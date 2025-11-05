package POO.inheritance.modifiers;


 * ==========================================================
 *                INHERITANCE - FINAL PRIMITIVE
 * ==========================================================
 *
 * CONCEPT INTRODUCTION
 * ----------------------------------------------------------
 * The 'final' keyword can be applied to variables, methods,
 * and classes. When used with a variable, it means that the
 * variable’s value cannot be changed after it has been assigned.
 *
 * In the case of **primitive types**, the value itself is fixed
 * — once assigned, you cannot reassign it.
 *
 * This is commonly used to define constants in Java.
 

public class InheritanceFinalPrimitive {
    public static void main(String[] args) {
        final int MAX_SPEED = 120;
        System.out.println("Max speed: " + MAX_SPEED);

        // Uncommenting the next line would cause a compilation error:
        // MAX_SPEED = 150;  // ❌ Error: cannot assign a value to final variable MAX_SPEED
    }
}


 * ==========================================================
 * EXPLANATION
 * ----------------------------------------------------------
 * 1. The keyword 'final' is used to declare a constant value.
 * 2. Once the value is assigned, it cannot be modified.
 * 3. Attempting to change it will cause a compilation error.
 *
 * This is useful for defining fixed values like mathematical
 * constants (PI), configuration limits, or system rules.
 *
 * QUICK REFERENCE
 * ----------------------------------------------------------
 * final int number = 10;
 * number = 20; // ❌ Error: cannot assign a value to final variable
 *
 * COMMON MISTAKES
 * ----------------------------------------------------------
 * - Forgetting to assign a value to a final variable during
 *   declaration or inside the constructor.
 * - Trying to reassign a value to a final primitive.
 *
 * LEARN MORE
 * ----------------------------------------------------------
 * 🔗 Official Documentation:
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 * 🔗 Keyword Reference:
 * https://docs.oracle.com/javase/tutorial/java/IandI/final.html
