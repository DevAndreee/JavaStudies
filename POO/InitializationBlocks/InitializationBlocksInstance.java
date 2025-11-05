// InitializationBlocks_Instance.java


/*
   Introduction
   Instance Initialization Blocks (IIB) are blocks of code inside a class
   that run every time an object is created, right BEFORE the constructor.
   They are useful when you want to ensure some logic runs regardless of
   which constructor is called.
*/

/*
   Key Ideas
   1. Declared with { ... } directly in the class (not inside methods).
   2. Executed in the order they appear in the class.
   3. Always run BEFORE the constructor code.
   4. Useful to avoid repetition if multiple constructors share setup logic.
*/

/*
   Example 1: Order of execution
*/
public class Person {
    String name;
    int age;

    // Instance block
    {
        System.out.println("IIB: Setting default values");
        name = "Unknown";
        age = 0;
    }

    public Person() {
        System.out.println("Constructor: Person created with defaults");
    }

    public Person(String name, int age) {
        System.out.println("Constructor: Overwriting defaults");
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        System.out.println("Creating person1");
        Person p1 = new Person();

        System.out.println("\nCreating person2");
        Person p2 = new Person("Alice", 25);

        System.out.println("\nResults:");
        System.out.println(p1.name + " - " + p1.age);
        System.out.println(p2.name + " - " + p2.age);
    }
}

/*
   Expected Output:
   Creating person1
   IIB: Setting default values
   Constructor: Person created with defaults

   Creating person2
   IIB: Setting default values
   Constructor: Overwriting defaults

   Results:
   Unknown - 0
   Alice - 25
*/

/*
   Example 2: Multiple instance blocks
*/
public class Example {
    {
        System.out.println("IIB 1: runs first");
    }

    {
        System.out.println("IIB 2: runs second");
    }

    public Example() {
        System.out.println("Constructor: runs after all IIBs");
    }

    public static void main(String[] args) {
        new Example();
    }
}

/*
   Expected Output:
   IIB 1: runs first
   IIB 2: runs second
   Constructor: runs after all IIBs
*/

/*
   Notes
   - IIBs are executed EVERY time an object is created, regardless of constructor.
   - They run BEFORE the constructor code but AFTER field initializations.
   - They are rarely used in modern Java, but help to understand the execution flow.
   - If you see duplicated code across multiple constructors, an IIB may simplify it.
*/