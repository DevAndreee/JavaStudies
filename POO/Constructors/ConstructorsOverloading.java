───────────────────────────────────────────────
📘 TOPIC: Constructors Overloading
───────────────────────────────────────────────
Definition:
Constructor overloading means defining multiple constructors in the same class with the **same name** but **different parameter lists** (number or type of parameters).
The compiler decides which constructor to use based on the arguments passed during object creation.
───────────────────────────────────────────────
class Car {
    String model;
    int year;
    String color;

    // Constructor 1 → No parameters
    public Car() {
        this.model = "Undefined";
        this.year = 0;
        this.color = "Undefined";
    }

    // Constructor 2 → Model and year
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Undefined";
    }

    // Constructor 3 → Model, year and color
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void showInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}

public class ConstructorsOverloading {
    public static void main(String[] args) {
        Car car1 = new Car();                        // Calls constructor 1
        Car car2 = new Car("Civic", 2020);           // Calls constructor 2
        Car car3 = new Car("Corolla", 2023, "Red");  // Calls constructor 3

        car1.showInfo();
        car2.showInfo();
        car3.showInfo();
    }
}
───────────────────────────────────────────────
📖 EXPLANATION
───────────────────────────────────────────────
• Overloading allows creating objects with different levels of detail.
• Each constructor initializes attributes differently, depending on the parameters.
• The compiler automatically chooses the correct constructor based on arguments.
───────────────────────────────────────────────
⚡ QUICK REFERENCE
───────────────────────────────────────────────
Overloading = same name + different parameter list.
Cannot overload by return type only.
Improves readability and flexibility.
───────────────────────────────────────────────
🚫 COMMON MISTAKES
───────────────────────────────────────────────
✗ Using same parameter types in all constructors (causes ambiguity).
✗ Thinking return type affects overloading — it doesn’t.
✗ Forgetting to initialize attributes consistently across constructors.
───────────────────────────────────────────────
💡 QUESTIONS TO REFLECT
───────────────────────────────────────────────
• What happens if two constructors have identical parameter types?
• Can overloaded constructors call each other using `this()`?
• Why does overloading improve class flexibility?
───────────────────────────────────────────────
🔍 LEARN MORE
───────────────────────────────────────────────
Oracle Docs → https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html
───────────────────────────────────────────────