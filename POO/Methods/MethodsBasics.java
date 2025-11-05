/*
 Methods in Java: reusable blocks of code
 Purpose:
  - Organize code
  - Reuse code
  - Provide cohesion in the program
  - Avoid repetition

 Types of methods:
 1. Void:
  - Perform an action
  - Do not return a value
  - Example: sayHello() → prints a message

 2. With return:
  - Compute or produce a result
  - Return a value of the declared type
  - Example: getNumber() → returns a number

 Advantages of using methods:
  - Cleaner and more readable code
  - Easier maintenance
  - Avoids duplication

 Common mistakes:
  - Forgetting to call the method
  - Using return incorrectly
  - Forgetting static when needed in main
*/

public class MethodsBasics {
    public static void main(String[] args) {

        // Void method example
        sayHello(); // just executes action, does not return anything

        // Method with return example
        int value = getNumber(); // returns a value that can be used
        System.out.println("Returned value: " + value);

        // Comparing void and return
        int sum = add(10, 20); // method with return using parameters
        System.out.println("Sum: " + sum);

        // Another void example with parameters
        showMessage("Learning Java!"); // just prints a message
    }

    // Void method: only prints a message
    public static void sayHello() {
        System.out.println("Hello, welcome!");
    }

    // Method with return: returns an integer
    public static int getNumber() {
        return 42;
    }

    // Method with return and parameters
    public static int add(int a, int b) {
        return a + b;
    }

    // Void method with parameters
    public static void showMessage(String msg) {
        System.out.println(msg);
    }
}