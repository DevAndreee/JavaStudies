
───────────────────────────────────────────────
📘 TOPIC: Classes vs Objects
───────────────────────────────────────────────
Topics covered in this file:
1. Difference between a class and an object
2. Class = blueprint / Object = instance
3. Attributes and methods belong to the class definition
4. Objects store actual values (state)
5. Multiple objects from the same class can exist independently
───────────────────────────────────────────────

A class is only a *template* that defines structure and behavior.  
An object is a *real instance* of that class, with its own unique data.  
───────────────────────────────────────────────


class Car {
    String brand;
    int speed;

    void startEngine() {
        System.out.println(brand + " engine started!");
    }

    void accelerate(int increment) {
        speed += increment;
        System.out.println(brand + " accelerated. Current speed: " + speed + " km/h");
    }
}

public class ClassesClassVsObjects {
    public static void main(String[] args) {
        // Class = blueprint (no real car yet)

        // Object = instance of the class
        Car car1 = new Car(); // first object
        car1.brand = "Tesla";
        car1.speed = 0;
        car1.startEngine();
        car1.accelerate(50);

        System.out.println("-----");

        Car car2 = new Car(); // another independent object
        car2.brand = "Ferrari";
        car2.speed = 0;
        car2.startEngine();
        car2.accelerate(100);

        System.out.println("-----");

        // Each object keeps its own state
        System.out.println("car1 → brand: " + car1.brand + " | speed: " + car1.speed);
        System.out.println("car2 → brand: " + car2.brand + " | speed: " + car2.speed);
    }
}


───────────────────────────────────────────────
📖 EXPLANATION
───────────────────────────────────────────────
• A **class** defines the structure and behavior (attributes + methods).  
• An **object** is an independent instance that stores actual data.  
• You can create many objects from the same class.  
───────────────────────────────────────────────

⚡ QUICK REFERENCE
───────────────────────────────────────────────
Class → Blueprint or plan.  
Object → Instance created from the class using `new`.  
Each object has its own copy of the attributes.  
───────────────────────────────────────────────

🚫 COMMON MISTAKES
───────────────────────────────────────────────
✗ Expecting the class itself to store data.  
✗ Thinking all objects share the same attributes.  
✗ Forgetting to use `new` when creating an object.  
───────────────────────────────────────────────

💡 QUESTIONS TO REFLECT
───────────────────────────────────────────────
• What happens if you modify car1.speed — does it affect car2?  
• Can we call methods on the class itself without creating an object?  
• Why do both cars share the same methods but not the same values?  
───────────────────────────────────────────────

🔍 LEARN MORE
───────────────────────────────────────────────
Oracle Docs → https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html  
───────────────────────────────────────────────
