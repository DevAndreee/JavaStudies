
───────────────────────────────────────────────
📘 TOPIC: Classes – Constructors
───────────────────────────────────────────────
Topics covered in this file:
1. What a constructor is
2. Default vs parameterized constructors
3. Using "this" to reference class attributes
4. Constructor overloading
───────────────────────────────────────────────

A constructor is a special method used to initialize objects.  
It has the same name as the class and **no return type**.  
It runs automatically when an object is created with **new**.

Analogy:
Class → Car  
Constructor → Factory setup that defines how each car is created.
───────────────────────────────────────────────


class Car {
    String brand;
    int year;
    int speed;

    // Default constructor (no parameters)
    Car() {
        brand = "Unknown";
        year = 2000;
        speed = 0;
        System.out.println("A car was created with default values.");
    }

    // Constructor with parameters
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.speed = 0; // every new car starts with speed 0
        System.out.println("Car created: " + brand + " (" + year + ")");
    }

    void accelerate(int increment) {
        speed += increment;
        System.out.println(brand + " accelerated to " + speed + " km/h");
    }

    int getSpeed() {
        return speed;
    }
}

public class ClassesConstructors {
    public static void main(String[] args) {
        // Using default constructor
        Car car1 = new Car();
        car1.accelerate(20);

        System.out.println("-----");

        // Using parameterized constructor
        Car car2 = new Car("Tesla", 2022);
        car2.accelerate(50);
        System.out.println("Final speed: " + car2.getSpeed() + " km/h");

        System.out.println("-----");

        // Another example
        Car car3 = new Car("Ferrari", 2023);
        car3.accelerate(100);
    }
}


───────────────────────────────────────────────
📖 EXPLANATION
───────────────────────────────────────────────
• Constructors set the initial state of an object.  
• You can overload constructors → multiple versions with different parameters.  
• "this" is used to distinguish between class attributes and parameters.  
• If no constructor is written, Java provides one by default.
───────────────────────────────────────────────

⚡ QUICK REFERENCE
───────────────────────────────────────────────
Syntax:
ClassName(parameters) { ... }

Rules:
• Same name as the class  
• No return type (not even void)  
• Called automatically with new  
───────────────────────────────────────────────

🚫 COMMON MISTAKES
───────────────────────────────────────────────
✗ Writing a return type in a constructor  
✗ Forgetting to use "this" when parameter names match attributes  
✗ Expecting default constructor when another one is defined
───────────────────────────────────────────────

💡 QUESTIONS TO REFLECT
───────────────────────────────────────────────
• What happens if no constructor is declared?  
• Why is "this" important in parameterized constructors?  
• Can one constructor call another? (Yes → use this())
───────────────────────────────────────────────

🔍 LEARN MORE
───────────────────────────────────────────────
Oracle Docs → https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html
───────────────────────────────────────────────
