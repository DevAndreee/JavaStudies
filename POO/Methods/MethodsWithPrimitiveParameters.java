/*
 Methods in Java can receive input values called parameters
 Parameters allow methods to perform actions or calculations with different data
 Primitive parameters: byte, short, int, long, float, double, char, boolean
 Void methods with primitive parameters:
  - Perform an action using the input values
 Methods with return and primitive parameters:
  - Compute a result using the input values
  - Return a value of the declared type
 Advantages:
  - Make methods reusable with different values
  - Avoid code duplication
 Common mistakes:
  - Wrong data type for parameters
  - Forgetting to pass required arguments
  - Mixing primitive and reference types incorrectly
*/

public class MethodsWithPrimitiveParameters {
    public static void main(String[] args) {

        // Void method with primitive parameters
        printSum(10, 20); // prints sum, does not return a value

        // Method with return and primitive parameters
        int result = multiply(5, 7); // returns product
        System.out.println("Product: " + result);

        // Another example: using double parameters
        double divisionResult = divide(10.0, 2.0);
        System.out.println("Division result: " + divisionResult);
    }

    // Void method with int parameters
    public static void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Method with return using int parameters
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method with return using double parameters
    public static double divide(double numerator, double denominator) {
        return numerator / denominator;
    }
}