```java
package POO.InitializationBlocks;

======================
CONCEPT INTRODUCTION
======================

Static Initialization Blocks (SIB) are blocks of code inside a class
declared with the 'static' keyword. They run ONCE when the class is 
loaded into memory, before any object is created and before main().

They are particularly useful for static initializations that require 
logic beyond simple assignments, such as loading configuration files,
initializing static collections, or setting up database connections.

Syntax:
static {
    // initialization code here
}

public class InitializationBlocksStatic {
    
    static String message;
    static int counter;

    static {
        System.out.println("[1] First static block executing");
        message = "Initialized via static block";
        counter = 100;
    }

    static {
        System.out.println("[2] Second static block executing");
        counter = counter + 50;
    }

    public static void main(String[] args) {
        System.out.println("[3] Main method executing");
        System.out.println("Message: " + message);
        System.out.println("Counter: " + counter);
    }
}

======================
EXPLANATION
======================

EXPLANATION:
- Static initialization blocks execute exactly once when the JVM loads the class into memory
- They run in the order they appear in the source code, from top to bottom
- All static blocks complete execution before the main method begins
- They execute before any static methods are called and before any objects are instantiated
- Multiple static blocks can exist in a single class and will execute sequentially
- Static blocks have access only to static members of the class
- They are commonly used for complex initialization logic that cannot be done in a single line

The execution sequence when a class is loaded:
1. Static variable declarations with direct initialization (if any)
2. Static initialization blocks in declaration order
3. Then main() or other static methods when called

Expected Output:
[1] First static block executing
[2] Second static block executing
[3] Main method executing
Message: Initialized via static block
Counter: 150

QUICK REFERENCE:
static { }               → static initialization block syntax
Execution timing         → once when class loads, before main()
Access scope            → only static members (fields and methods)
Multiple blocks         → execute in order of appearance
Use case                → complex static initialization requiring logic

COMMON MISTAKES:
- Assuming static blocks run every time an object is created (they run only once per class loading)
- Trying to access instance variables inside static blocks (compilation error - static context cannot access instance members)
- Forgetting that order matters when multiple static blocks exist
- Placing complex or slow operations in static blocks (delays class loading and program startup)
- Not understanding that static blocks run even if you never create an object of that class

LEARN MORE:
https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
(Section: Initializing Fields - Static Initialization Blocks)
```
