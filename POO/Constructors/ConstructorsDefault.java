───────────────────────────────────────────────
📘 TOPIC: Default Constructors
───────────────────────────────────────────────
Key points:
• If no constructor is explicitly declared, Java automatically provides a **default constructor**.  
• The default constructor takes **no parameters** and initializes attributes with **default values**.  
• Once you create any constructor (with or without parameters), Java **stops generating** the default one.  
───────────────────────────────────────────────
class Car {
    String model;
    int year;

    // Uncomment this constructor to disable the automatic default constructor
    /*
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    */
}

public class ConstructorsDefault {
    public static void main(String[] args) {
        // Since no constructor is declared, Java provides a default constructor
        Car car1 = new Car();

        System.out.println("Model: " + car1.model + ", Year: " + car1.year);
        // Output → Model: null, Year: 0
    }
}
───────────────────────────────────────────────
📖 EXPLANATION
───────────────────────────────────────────────
• When you don’t define any constructor, Java creates one automatically:
  → public ClassName() { }
• It sets attributes to their default values (e.g., 0 for int, null for String).  
• Defining any custom constructor removes the automatic one.
───────────────────────────────────────────────
⚡ QUICK REFERENCE
───────────────────────────────────────────────
Default constructor → Added automatically if no other exists.  
Default values → int = 0, double = 0.0, boolean = false, object = null.  
───────────────────────────────────────────────
🚫 COMMON MISTAKES
───────────────────────────────────────────────
✗ Declaring a parameterized constructor and forgetting to add a no-arg version.  
✗ Assuming Java will still provide a default constructor after adding your own.  
───────────────────────────────────────────────
💡 QUESTIONS TO REFLECT
───────────────────────────────────────────────
• What happens if you declare a constructor with parameters and then call `new Car()`?  
• Why is it useful to explicitly define a no-argument constructor?  
• When might you need both a default and a parameterized constructor?  
───────────────────────────────────────────────
🔍 LEARN MORE
───────────────────────────────────────────────
Oracle Docs → https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html  
───────────────────────────────────────────────