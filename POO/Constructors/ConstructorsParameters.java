package POO.constructors;


───────────────────────────────────────────────
📘 TOPIC: Constructors with Parameters
───────────────────────────────────────────────
Key points:
• Constructors can receive parameters, just like methods.  
• This allows initializing attributes with specific values during object creation.  
• Using constructors with parameters prevents objects from being in an undefined state.  
───────────────────────────────────────────────


class Car {
    String model;
    int year;

    // Constructor with parameters
    Car(String model, int year) {
        this.model = model;  // "this" refers to the current object's attribute
        this.year = year;
    }

    void showInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class ConstructorsParameters {
    public static void main(String[] args) {
        Car car1 = new Car("Civic", 2020);
        Car car2 = new Car("Corolla", 2023);

        car1.showInfo();
        car2.showInfo();
    }
}


───────────────────────────────────────────────
📖 EXPLANATION
───────────────────────────────────────────────
• A constructor with parameters lets you define values when creating an object.  
• The `this` keyword distinguishes between attributes and parameters with the same name.  
• Each object receives its own values, keeping them independent.  
───────────────────────────────────────────────

⚡ QUICK REFERENCE
───────────────────────────────────────────────
this.var → Refers to the current object’s attribute.  
Constructors → Have no return type and share the class name.  
Parameters → Allow setting custom values during object creation.  
───────────────────────────────────────────────

🚫 COMMON MISTAKES
───────────────────────────────────────────────
✗ Forgetting to use `this` when parameter names match attributes.  
✗ Adding a return type (e.g., `void`) — constructors don’t have one.  
✗ Creating objects without providing required arguments.  
───────────────────────────────────────────────

💡 QUESTIONS TO REFLECT
───────────────────────────────────────────────
• What happens if you omit parameters when calling a constructor that requires them?  
• Why is using `this` important when parameter names match attribute names?  
• How does each object maintain independent attribute values?  
───────────────────────────────────────────────

🔍 LEARN MORE
───────────────────────────────────────────────
Oracle Docs → https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html  
───────────────────────────────────────────────
