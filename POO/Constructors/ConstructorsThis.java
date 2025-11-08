
───────────────────────────────────────────────
📘 TOPIC: Constructors and this()
───────────────────────────────────────────────
Key points:
• You can call one constructor from another within the same class using `this()`.  
• Helps avoid code duplication by centralizing initialization logic.  
• `this()` must always be the **first statement** inside the constructor body.
───────────────────────────────────────────────


class Car {
    String model;
    int year;
    String color;

    // Constructor 1 → No parameters
    public Car() {
        this("Undefined", 0, "Undefined"); // Calls constructor 3
    }

    // Constructor 2 → Model and year
    public Car(String model, int year) {
        this(model, year, "Undefined"); // Calls constructor 3
    }

    // Constructor 3 → Full initialization
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void showInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}

public class ConstructorsThis {
    public static void main(String[] args) {
        Car car1 = new Car();                        // Calls constructor 1 → this() → constructor 3
        Car car2 = new Car("Civic", 2020);           // Calls constructor 2 → this() → constructor 3
        Car car3 = new Car("Corolla", 2023, "Red");  // Calls constructor 3 directly

        car1.showInfo();
        car2.showInfo();
        car3.showInfo();
    }
}


───────────────────────────────────────────────
📖 EXPLANATION
───────────────────────────────────────────────
• The `this()` call allows one constructor to reuse another.  
• It helps avoid repeating code when several constructors share logic.  
• When using `this()`, it must always appear **as the first statement**.  
───────────────────────────────────────────────

⚡ QUICK REFERENCE
───────────────────────────────────────────────
this()  → Calls another constructor in the same class.  
this.var → Refers to the current object’s attribute.  
───────────────────────────────────────────────

🚫 COMMON MISTAKES
───────────────────────────────────────────────
✗ Writing code before `this()` in a constructor (causes compilation error).  
✗ Creating a recursive call: a constructor that calls itself.  
✗ Forgetting to initialize fields when skipping `this()`.  
───────────────────────────────────────────────

💡 QUESTIONS TO REFLECT
───────────────────────────────────────────────
• What happens if you remove `this()` from the first constructor?  
• Can `super()` (calling parent constructor) and `this()` appear together?  
• Why must `this()` always come first inside a constructor?  
───────────────────────────────────────────────

🔍 LEARN MORE
───────────────────────────────────────────────
Oracle Docs → https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html  
───────────────────────────────────────────────
