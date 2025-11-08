```java
package POO.InitializationBlocks;

======================
CONCEPT INTRODUCTION
======================

Instance Initialization Blocks (IIB) are blocks of code inside a class
that run every time an object is created, right BEFORE the constructor.

They are useful when you want to ensure some logic runs regardless of
which constructor is called, helping to avoid code duplication across
multiple constructors.

Syntax:
{
    initialization code here
}

public class InitializationBlocksInstance {
    
    String name;
    int age;

    {
        System.out.println("[1] IIB: Setting default values");
        name = "Unknown";
        age = 0;
    }

    public InitializationBlocksInstance() {
        System.out.println("[2] Constructor: Person created with defaults");
    }

    public InitializationBlocksInstance(String name, int age) {
        System.out.println("[2] Constructor: Overwriting defaults");
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        System.out.println("Creating person1");
        InitializationBlocksInstance p1 = new InitializationBlocksInstance();

        System.out.println("\nCreating person2");
        InitializationBlocksInstance p2 = new InitializationBlocksInstance("Alice", 25);

        System.out.println("\nResults:");
        System.out.println(p1.name + " - " + p1.age);
        System.out.println(p2.name + " - " + p2.age);
    }
}

======================
EXPLANATION
======================

EXPLANATION:
- Instance initialization blocks execute every time an object is created, not just once like static blocks
- They run in the order they appear in the class, from top to bottom
- All instance blocks complete execution before any constructor code runs
- They execute after instance field initialization but before constructor body
- Multiple instance blocks can exist and will execute sequentially
- They are particularly useful when multiple constructors share common initialization logic
- Less common in modern Java but important for understanding object creation flow

The execution sequence for each object creation:
1. Instance field declarations with direct initialization (if any)
2. Instance initialization blocks in declaration order
3. Constructor body execution

This means the IIB can set default values that the constructor can then override if needed,
creating a flexible initialization pattern where common setup happens in the block and
constructor-specific setup happens in the constructor body.

Expected Output:
Creating person1
[1] IIB: Setting default values
[2] Constructor: Person created with defaults

Creating person2
[1] IIB: Setting default values
[2] Constructor: Overwriting defaults

Results:
Unknown - 0
Alice - 25

Notice: The IIB runs for both objects, setting defaults each time.
The second constructor then overwrites those defaults with provided values.

QUICK REFERENCE:
{ }                      → instance initialization block syntax
Execution timing         → every object creation, before constructor
Access scope            → all instance and static members
Multiple blocks         → execute in order of appearance
Use case                → shared initialization logic across constructors

COMMON MISTAKES:
- Confusing instance blocks with static blocks (instance blocks run per object, static blocks run once per class)
- Assuming constructors run before instance blocks (blocks always execute first)
- Forgetting that instance blocks run for EVERY object creation (not just the first)
- Placing logic in instance blocks that should be in constructors (use blocks only for truly shared initialization)
- Not understanding execution order when multiple instance blocks exist (they run top to bottom)

LEARN MORE:
https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
(Section: Initializing Fields - Instance Initialization Blocks)
```