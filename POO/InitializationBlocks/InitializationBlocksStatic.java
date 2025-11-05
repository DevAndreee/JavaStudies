// InitializationBlocks_Static.java


/*
   Introduction
   Static Initialization Blocks (SIB) are blocks of code inside a class
   declared with the 'static' keyword. They run ONCE when the class is 
   loaded into memory, before any object is created and before main().
*/

/*
   Key Ideas
   1. Declared with: static { ... } directly in the class.
   2. Executed only ONCE, when the class is loaded by the JVM.
   3. Run before main() and before any static methods or attributes are used.
   4. Useful for static initializations that require logic (not just a simple assignment).
*/

/*
   Example 1: Static block runs before main
*/
public class StaticExample {
    static {
        System.out.println("Static Block: runs when class is loaded");
    }

    public static void main(String[] args) {
        System.out.println("Main Method: runs after static block");
    }
}

/*
   Expected Output:
   Static Block: runs when class is loaded
   Main Method: runs after static block
*/

/*
   Example 2: Static block initializing static fields
*/
public class DatabaseConnection {
    static String url;
    static String user;

    // Static block to initialize complex logic
    static {
        System.out.println("Static Block: initializing static fields");
        url = "jdbc:mysql://localhost:3306/mydb";
        user = "admin";
    }

    public static void connect() {
        System.out.println("Connecting to " + url + " with user " + user);
    }

    public static void main(String[] args) {
        DatabaseConnection.connect();
    }
}

/*
   Expected Output:
   Static Block: initializing static fields
   Connecting to jdbc:mysql://localhost:3306/mydb with user admin
*/

/*
   Example 3: Multiple static blocks
*/
public class MultiStatic {
    static {
        System.out.println("Static Block 1: runs first");
    }

    static {
        System.out.println("Static Block 2: runs second");
    }

    public static void main(String[] args) {
        System.out.println("Main Method: after all static blocks");
    }
}

/*
   Expected Output:
   Static Block 1: runs first
   Static Block 2: runs second
   Main Method: after all static blocks
*/

/*
   Notes
   - Static blocks run ONCE per class loading, never again.
   - Order matters: they execute in the sequence they appear in the code.
   - They are often used for initializing static variables or configurations.
   - Be careful: complex static initialization may slow down startup.
*/