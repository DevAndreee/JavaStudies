───────────────────────────────────────────────
📘 TOPIC: Constructors Basics
───────────────────────────────────────────────
Key points:
• A constructor is a **special method** called when an object is created using `new`.  
• Its name **must match the class name** and it **has no return type** (not even `void`).  
• Constructors are used to **initialize attributes** and ensure valid object states.  
───────────────────────────────────────────────
class Car {
    String model;
    int year;

    // Constructor (no-argument)
    Car() {
        model = "Undefined";
        year = 0;
    }

    void showInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class ConstructorsBasics {
    public static void main(String[] args) {
        // Creating an object → automatically calls the constructor
        Car car1 = new Car();
        car1.showInfo();
    }
}
───────────────────────────────────────────────
📖 EXPLANATION
───────────────────────────────────────────────
• The constructor runs automatically when `new Car()` is used.  
• It initializes attributes so the object starts in a known, valid state.  
• If no constructor is defined, Java automatically provides a **default constructor**.  
───────────────────────────────────────────────
⚡ QUICK REFERENCE
───────────────────────────────────────────────
Constructor → Special method to initialize objects.  
Syntax → `ClassName(parameters) { ... }`  
Default constructor → Provided only if no custom constructor exists.  
───────────────────────────────────────────────
🚫 COMMON MISTAKES
───────────────────────────────────────────────
✗ Giving a constructor a return type (it becomes a regular method).  
✗ Forgetting to initialize attributes, leaving objects in undefined states.  
✗ Assuming the default constructor still exists after creating your own.  
───────────────────────────────────────────────
💡 QUESTIONS TO REFLECT
───────────────────────────────────────────────
• What happens if you create an object without defining a constructor?  
• Why can’t constructors have a return type?  
• How could you use parameters to make this constructor more flexible?  
───────────────────────────────────────────────
🔍 LEARN MORE
───────────────────────────────────────────────
Oracle Docs → https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html  
───────────────────────────────────────────────