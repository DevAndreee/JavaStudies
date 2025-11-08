
───────────────────────────────────────────────
📘 TOPIC: Classes – Methods
───────────────────────────────────────────────
Topics covered in this file:
1. What are methods in a class?
2. Methods with and without parameters
3. Methods that return values
4. Using attributes inside methods
───────────────────────────────────────────────

Methods are blocks of code inside a class that define the *behavior* of objects.  
Attributes describe “what the object is” (its state).  
Methods describe “what the object does” (its actions).

Analogy:
Class → Car  
Attributes → brand, model, year  
Methods → startEngine(), accelerate(), brake()
───────────────────────────────────────────────


class Car {
    // Attributes
    String brand;
    int speed;

    // Method without parameters
    void startEngine() {
        System.out.println(brand + " engine started!");
    }

    // Method with parameter
    void accelerate(int increment) {
        speed += increment;
        System.out.println(brand + " accelerated. Current speed: " + speed + " km/h");
    }

    // Method with return
    int getSpeed() {
        return speed;
    }

    // Method using both attribute and parameter
    void setBrand(String newBrand) {
        brand = newBrand;
    }
}

public class ClassesMethods {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Tesla");

        car1.startEngine();
        car1.accelerate(30);
        car1.accelerate(20);

        System.out.println("Final speed of " + car1.brand + ": " + car1.getSpeed() + " km/h");
        System.out.println("------");

        Car car2 = new Car();
        car2.setBrand("Ferrari");
        car2.startEngine();
        car2.accelerate(50);

        System.out.println("Final speed of " + car2.brand + ": " + car2.getSpeed() + " km/h");
    }
}


───────────────────────────────────────────────
📖 EXPLANATION
───────────────────────────────────────────────
- Methods define what an object can do.
- They can:
  • Use attributes → startEngine() uses brand.
  • Take parameters → accelerate(int increment).
  • Return values → getSpeed() returns current speed.
- Methods make objects *active* rather than static data.

───────────────────────────────────────────────
⚡ QUICK REFERENCE
───────────────────────────────────────────────
Method Declaration → returnType methodName(parameters) { ... }
Call Syntax → object.methodName(args);
Return → Use "return value;" inside the method.
Void → Means “no return value”.
───────────────────────────────────────────────

🚫 COMMON MISTAKES
───────────────────────────────────────────────
✗ Forgetting to initialize attributes before using them.
✗ Returning a value in a void method.
✗ Declaring parameters but never using them.
───────────────────────────────────────────────

💡 QUESTIONS TO REFLECT
───────────────────────────────────────────────
• What happens if you call accelerate() before startEngine()?  
• What if you never set the brand?  
• Why does getSpeed() return an int instead of void?  
• Can a method return an object instead of a primitive?
───────────────────────────────────────────────


🔍 LEARN MORE
───────────────────────────────────────────────
Oracle Docs → https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
───────────────────────────────────────────────
