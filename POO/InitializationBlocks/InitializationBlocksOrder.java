```java
package POO.InitializationBlocks;

======================
CONCEPT INTRODUCTION
======================

When a class is used in Java, the JVM follows a strict order 
for initialization and execution.

Understanding this order is crucial for debugging initialization issues
and writing predictable code, especially when dealing with inheritance
and complex object creation scenarios.

For each class, the initialization sequence is:
1. Static blocks and static fields → executed ONCE, when the class is loaded
2. Instance fields and instance blocks → executed EACH TIME an object is created
3. Constructor → executed right after instance initialization

Syntax:
static { } for static initialization
{ } for instance initialization

public class InitializationBlocksOrder {
    
    static String staticField = initStaticField();

    static {
        System.out.println("[2] Static Block: runs once when class loads");
    }

    String instanceField = initInstanceField();

    {
        System.out.println("[4] Instance Block: runs before constructor");
    }

    public InitializationBlocksOrder() {
        System.out.println("[5] Constructor: runs after instance block");
    }

    private static String initStaticField() {
        System.out.println("[1] Static Field Initialization");
        return "StaticValue";
    }

    private String initInstanceField() {
        System.out.println("[3] Instance Field Initialization");
        return "InstanceValue";
    }

    public static void main(String[] args) {
        System.out.println("Main starts\n");
        System.out.println("Creating first object...");
        new InitializationBlocksOrder();
        System.out.println("\nCreating second object...");
        new InitializationBlocksOrder();
    }
}

======================
EXPLANATION
======================

EXPLANATION:
- Static initialization happens only once per class, when the JVM first loads the class into memory
- Static fields are initialized in declaration order, followed by static blocks in declaration order
- Instance initialization happens every time you create a new object of that class
- Instance fields are initialized in declaration order, followed by instance blocks in declaration order
- The constructor body executes last, after all instance initialization is complete
- If you create multiple objects, static initialization is skipped on subsequent creations
- The order is completely predictable and follows the same pattern every time

Detailed execution flow:
1. Static field initialization (in order of declaration)
2. Static initialization blocks (in order of declaration)
3. Instance field initialization (in order of declaration)
4. Instance initialization blocks (in order of declaration)
5. Constructor body execution

Expected Output:
[1] Static Field Initialization
[2] Static Block: runs once when class loads
Main starts

Creating first object...
[3] Instance Field Initialization
[4] Instance Block: runs before constructor
[5] Constructor: runs after instance block

Creating second object...
[3] Instance Field Initialization
[4] Instance Block: runs before constructor
[5] Constructor: runs after instance block

Notice: Static initialization [1] and [2] only appear once, before the first object creation.
Instance initialization [3], [4], [5] repeat for each new object.

QUICK REFERENCE:
Static initialization    → once per class load (fields then blocks)
Instance initialization  → every object creation (fields then blocks then constructor)
Execution order         → static fields → static blocks → instance fields → instance blocks → constructor
Multiple objects        → static phase skipped, only instance phase repeats

COMMON MISTAKES:
- Assuming constructors run before instance blocks (instance blocks always execute first)
- Forgetting that static initialization happens only once regardless of how many objects you create
- Not understanding the order within each phase (declaration order matters for both fields and blocks)
- Trying to access instance members in static initialization blocks (compilation error)
- Relying on field initialization order across different files (only guaranteed within same class)

LEARN MORE:
https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
(Section: Initializing Fields)
https://docs.oracle.com/javase/specs/jls/se17/html/jls-12.html#jls-12.5
(Section: Creation of New Class Instances)
```