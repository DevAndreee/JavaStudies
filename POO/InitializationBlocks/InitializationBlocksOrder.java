// InitializationBlocks_Order.java


/*
   Introduction
   When a class is used in Java, the JVM follows a strict order 
   for initialization and execution.

   For each class:
   1. Static blocks and static fields → executed ONCE, when the class is loaded.
   2. Instance fields and instance blocks → executed EACH TIME an object is created.
   3. Constructor → executed right after instance initialization.
*/

/*
   Example 1: Execution order overview
*/
public class OrderExample {
    // 1. Static field
    static String staticField = initStaticField();

    // 2. Static block
    static {
        System.out.println("Static Block: runs once when class loads");
    }

    // Instance field
    String instanceField = initInstanceField();

    // Instance block
    {
        System.out.println("Instance Block: runs before constructor");
    }

    // Constructor
    public OrderExample() {
        System.out.println("Constructor: runs after instance block");
    }

    // Static method to initialize static field
    private static String initStaticField() {
        System.out.println("Static Field Initialization");
        return "StaticValue";
    }

    // Method to initialize instance field
    private String initInstanceField() {
        System.out.println("Instance Field Initialization");
        return "InstanceValue";
    }

    public static void main(String[] args) {
        System.out.println("Main starts");
        System.out.println("Creating first object...");
        new OrderExample();
        System.out.println("Creating second object...");
        new OrderExample();
    }
}

/*
   Expected Output:
   Static Field Initialization
   Static Block: runs once when class loads
   Main starts
   Creating first object...
   Instance Field Initialization
   Instance Block: runs before constructor
   Constructor: runs after instance block
   Creating second object...
   Instance Field Initialization
   Instance Block: runs before constructor
   Constructor: runs after instance block
*/

/*
   Notes
   - Static field + static block: run only ONCE when the class is loaded.
   - Instance field + instance block: run EVERY TIME an object is created.
   - Constructor: always comes AFTER instance initialization.
   - Order: Static fields → Static blocks → Instance fields → Instance blocks → Constructor.
*/