```java
package POO.InitializationBlocks;

======================
CONCEPT INTRODUCTION
======================

In Java, besides constructors, there are special code sections called 
"initialization blocks". They allow you to execute logic automatically 
when the class is loaded (static blocks) or when an object is created 
(instance blocks).

Understanding initialization blocks is crucial for grasping Java's complete
object creation lifecycle and the order in which different parts of your
code execute.

Two types exist:

1. Instance Initialization Block (IIB):
   - Runs every time an object is created
   - Executes before the constructor

2. Static Initialization Block (SIB):
   - Runs only once, when the class is loaded into memory
   - Commonly used to initialize static variables

Syntax:
{ }          for instance blocks
static { }   for static blocks

public class InitializationBlocksBasics {
    
    static {
        System.out.println("[1] Static block: runs once when class is loaded");
    }

    {
        System.out.println("[2] Instance block: runs before constructor");
    }

    public InitializationBlocksBasics() {
        System.out.println("[3] Constructor: runs after instance block");
    }

    public static void main(String[] args) {
        System.out.println("\nCreating first object");
        InitializationBlocksBasics obj1 = new InitializationBlocksBasics();

        System.out.println("\nCreating second object");
        InitializationBlocksBasics obj2 = new InitializationBlocksBasics();
    }
}

======================
EXPLANATION
======================

EXPLANATION:
- Initialization blocks provide additional control over when and how code executes during object creation
- Static blocks execute exactly once per class, when the JVM first loads the class into memory
- Instance blocks execute every time a new object is created, before the constructor body runs
- Static blocks are useful for complex static initialization that cannot be done in a single assignment
- Instance blocks are useful for initialization code shared across multiple constructors
- The execution order is predictable: static blocks first (once), then instance blocks (per object), then constructor
- Both types of blocks can contain any valid Java code, including loops, conditionals, and method calls

When you run this program, the static block executes first, even before main() starts.
Then, for each object created, the instance block runs followed immediately by the constructor.
If you create a second object, the static block does NOT run again because the class is already loaded.

Expected Output:
[1] Static block: runs once when class is loaded

Creating first object
[2] Instance block: runs before constructor
[3] Constructor: runs after instance block

Creating second object
[2] Instance block: runs before constructor
[3] Constructor: runs after instance block

Notice: The static block [1] appears only once at the beginning.
The instance block [2] and constructor [3] repeat for each object creation.

QUICK REFERENCE:
{ }                      → instance initialization block (runs per object)
static { }               → static initialization block (runs once per class)
Instance block timing    → before constructor, every object creation
Static block timing      → once when class loads, before any object exists
Use case                → complex initialization requiring logic beyond simple assignment

COMMON MISTAKES:
- Confusing when static versus instance blocks execute (static once per class, instance per object)
- Assuming instance blocks run after constructors (they always run before)
- Forgetting that static blocks run even if you never create an object (class loading triggers them)
- Using initialization blocks for simple assignments that could be done inline (reserve blocks for complex logic)
- Not understanding that multiple blocks of the same type execute in declaration order

LEARN MORE:
https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
(Section: Initializing Fields)
```