package POO.inheritance.modifiers;


 * ==========================================================
 *                INHERITANCE - FINAL REFERENCE
 * ==========================================================
 *
 * CONCEPT INTRODUCTION
 * ----------------------------------------------------------
 * When a variable that holds a reference (object) is declared
 * as 'final', it means that the **reference itself cannot be
 * changed** to point to another object.
 *
 * However, the object’s internal state (its fields) can still
 * be modified — unless those fields are also declared 'final'.
 

class Car {
    String model;
    int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void showInfo() {
        System.out.println(model + " running at " + speed + " km/h");
    }
}

public class InheritanceFinalReference {
    public static void main(String[] args) {
        final Car myCar = new Car("Tesla", 100);

        myCar.showInfo();

        // ✅ Allowed: modifying object’s internal state
        myCar.speed = 150;
        myCar.showInfo();

        // ❌ Not allowed: reassigning the reference
        // myCar = new Car("BMW", 200);  // Compilation error
    }
}


 * ==========================================================
 * EXPLANATION
 * ----------------------------------------------------------
 * 1. 'final' in reference types prevents reassigning the variable
 *    to another object.
 * 2. It does NOT make the object immutable — fields can still
 *    change unless they are also 'final'.
 * 3. Reassigning the reference will cause a compilation error.
 *
 * QUICK REFERENCE
 * ----------------------------------------------------------
 * final Car car = new Car("Ford", 120);
 * car = new Car("BMW", 200);  // ❌ Error
 * car.speed = 150;            // ✅ Allowed
 *
 * COMMON MISTAKES
 * ----------------------------------------------------------
 * - Assuming 'final' makes the object itself immutable.
 * - Forgetting to declare fields as 'final' when you truly
 *   want immutability.
 *
 * LEARN MORE
 * ----------------------------------------------------------
 * 🔗 Official Documentation:
 * https://docs.oracle.com/javase/tutorial/java/IandI/final.html
 * 🔗 Immutability Concepts:
 * https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html
 