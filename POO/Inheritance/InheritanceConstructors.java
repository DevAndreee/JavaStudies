
Constructor behavior in inheritance follows a specific execution order.
When a subclass object is created, Java automatically calls the superclass constructor 
BEFORE executing the subclass constructor body.

Understanding this flow is essential for proper object initialization in class hierarchies.


// Parent class with multiple constructors
class Vehicle {
    protected String brand;
    protected int year;

    // No-argument constructor
    public Vehicle() {
        System.out.println("Vehicle() - no-arg constructor called");
        this.brand = "Unknown";
        this.year = 0;
    }

    // Parameterized constructor
    public Vehicle(String brand, int year) {
        System.out.println("Vehicle(String, int) constructor called");
        this.brand = brand;
        this.year = year;
    }

    public void showInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

// Subclass demonstrating constructor chaining
class Car extends Vehicle {
    private String model;

    // Constructor with explicit super() call
    public Car(String brand, int year, String model) {
        super(brand, year);  // Must be the FIRST statement
        System.out.println("Car(String, String, int) constructor called");
        this.model = model;
    }

    // Constructor without explicit super() - implicit call happens
    public Car(String model) {
        // Java automatically adds: super();
        System.out.println("Car(String) constructor called");
        this.model = model;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Model: " + model);
    }
}

public class InheritanceConstructors {
    public static void main(String[] args) {
        System.out.println("=== Creating Car with 3 parameters ===");
        Car c1 = new Car("Honda", 2022, "Civic");
        c1.showInfo();

        System.out.println("\n=== Creating Car with 1 parameter ===");
        Car c2 = new Car("Accord");
        c2.showInfo();

        // Notice the execution order in both cases:
        // 1. Superclass constructor runs first
        // 2. Then subclass constructor body executes
    }
}


===== EXPLANATION =====

1. Constructor chaining in inheritance → the process where a subclass constructor automatically 
   calls a superclass constructor before executing its own body. This ensures the parent part 
   of the object is initialized before the child part.

2. Execution order when creating a subclass object:
   - First: Superclass constructor executes completely
   - Second: Subclass constructor body executes
   - This happens even if you don't see super() explicitly written

3. The super() call rules:
   - If you write super() explicitly, it MUST be the first statement in the constructor
   - If you don't write super(), Java automatically inserts super() with no arguments
   - You cannot call both super() and this() in the same constructor
   - You must ensure the superclass has a matching constructor for your super() call

4. When the implicit super() causes problems:
   ✅ Works fine if parent has a no-argument constructor
   ❌ Compilation error if parent has ONLY parameterized constructors and you don't call super() explicitly
   ✅ Solution: Always explicitly call super() with required parameters

5. Why this design exists:
   A subclass inherits everything from its parent, so the parent part must be properly set up 
   before the subclass can add its own functionality. Java enforces this through automatic 
   constructor chaining, preventing partially initialized objects.

---

📌 QUICK REFERENCE:
super(params)     → explicitly calls parent constructor (must be first line)
super()           → calls parent no-arg constructor (implicit if not written)
this(params)      → calls another constructor in same class (cannot use with super)
Execution order   → parent constructor → child constructor body

---

⚠️ COMMON MISTAKES:
- Forgetting that super() is implicitly called → leads to confusion when parent has no no-arg constructor
- Trying to use super() after other statements → compilation error, super() must be first
- Not providing matching parent constructor → if parent only has parameterized constructors, you must call super(params) explicitly
- Assuming you can skip parent initialization → impossible in Java, parent always initializes first
- Trying to use this() and super() together → can only use one, not both

---

Learn more:
🔗 https://docs.oracle.com/javase/tutorial/java/IandI/super.html
(Section: "Using the Keyword super - Subclass Constructors")
