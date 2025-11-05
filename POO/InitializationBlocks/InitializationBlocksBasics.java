// InitializationBlocks_Basics.java


/*
   Introduction
   In Java, besides constructors, there are special code sections called 
   "initialization blocks". They allow you to execute logic automatically 
   when the class is loaded (static blocks) or when an object is created 
   (instance blocks).
*/

/*
   Key Ideas
   1. Instance Initialization Block (IIB):
      - Runs every time an object is created.
      - Executes before the constructor.

   2. Static Initialization Block (SIB):
      - Runs only once, when the class is loaded into memory.
      - Commonly used to initialize static variables.

   3. Syntax:
      - Instance block: { ... }
      - Static block: static { ... }
*/

/*
   Example 1: Instance Initialization Block
*/
public class Dog {
    {
        System.out.println("Instance block: runs before constructor");
    }

    public Dog() {
        System.out.println("Constructor: runs after instance block");
    }

    public static void main(String[] args) {
        System.out.println("Creating first Dog");
        Dog d1 = new Dog();

        System.out.println("Creating second Dog");
        Dog d2 = new Dog();
    }
}

/*
   Expected Output:
   Creating first Dog
   Instance block: runs before constructor
   Constructor: runs after instance block
   Creating second Dog
   Instance block: runs before constructor
   Constructor: runs after instance block
*/

/*
   Example 2: Static Initialization Block
*/
public class Cat {
    static {
        System.out.println("Static block: runs once when class is loaded");
    }

    public Cat() {
        System.out.println("Constructor: runs every time a new object is created");
    }

    public static void main(String[] args) {
        System.out.println("Starting main");
        Cat c1 = new Cat();
        Cat c2 = new Cat();
    }
}

/*
   Expected Output:
   Static block: runs once when class is loaded
   Starting main
   Constructor: runs every time a new object is created
   Constructor: runs every time a new object is created
*/

/*
   Notes
   - Instance blocks are executed every time you create a new object.
   - Static blocks are executed only once, when the class is first used.
   - They are not common in daily programming, but they are very important 
     to understand the order of execution in Java.
*/