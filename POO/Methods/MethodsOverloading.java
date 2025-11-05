package POO.Methods;

/**
 * Methods_Overloading.java
 *
 * Method overloading means creating multiple methods in the same class
 * with the same name, but different parameter lists (different number or type).
 * 
 * This allows flexibility: the correct method is chosen (resolved) at compile time,
 * based on the arguments passed.
 */
public class Methods_Overloading {

    // Example 1: Overloading with different parameter types
    public void print(int value) {
        System.out.println("Printing int: " + value);
    }

    public void print(double value) {
        System.out.println("Printing double: " + value);
    }

    public void print(String value) {
        System.out.println("Printing String: " + value);
    }

    // Example 2: Overloading with different number of parameters
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Example 3: Overloading with varargs
    public int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        Methods_Overloading example = new Methods_Overloading();

        // Example 1: same method name "print", different parameter types
        example.print(10);        // int version
        example.print(10.5);      // double version
        example.print("Hello");   // String version

        // Example 2: same method name "sum", different number of parameters
        System.out.println("Sum 2 numbers: " + example.sum(2, 3));
        System.out.println("Sum 3 numbers: " + example.sum(2, 3, 4));

        // Example 3: varargs (any number of parameters)
        System.out.println("Sum varargs: " + example.sum(1, 2, 3, 4, 5));
    }
}

/**
 * Key Points:
 * - Overloading is determined by the method signature (name + parameters).
 * - Return type alone is NOT enough to overload a method.
 * - The compiler decides which method to call at compile time.
 * - Overloading improves readability and code flexibility.
 */