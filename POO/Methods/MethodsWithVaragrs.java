/*
 Varargs (variable arguments) allow a method to accept a flexible
number of parameters of the same type.

 Syntax:
    returnType methodName(type... paramName) { ... }

 Rules:
  • A method can have only **one varargs parameter**
  • The varargs **must be the last parameter**
  • Inside the method, the varargs is treated as an **array**
  • You can call the method with zero, one, or many arguments

 Difference between Array and Varargs:
  - Array → you need to explicitly create and pass the array
  - Varargs → you can pass the values directly (more practical)

 Advantages:
  - Cleaner and more flexible code
  - Useful when the number of arguments is unknown
  - Avoids writing multiple overloaded methods
*/

public class MethodsWithVarargs {
    public static void main(String[] args) {

        // Example 1: summing numbers (zero, one, or many arguments)
        System.out.println(sum());           // 0
        System.out.println(sum(5));          // 5
        System.out.println(sum(1, 2, 3, 4)); // 10

        // Example 2: printing messages
        printMessages("Hi");
        printMessages("Hi", "How are you?", "Bye");

        // Example 3: mixing normal parameter + varargs
        greet("André", "Welcome!", "Enjoy the class!");
    }

    // Sum numbers using varargs
    public static int sum(int... numbers) {
        int result = 0;
        for (int n : numbers) {
            result += n;
        }
        return result;
    }

    // Print multiple messages
    public static void printMessages(String... msgs) {
        for (String msg : msgs) {
            System.out.println(msg);
        }
    }

    // Regular parameter + varargs (varargs must be the last one)
    public static void greet(String name, String... messages) {
        System.out.println("Hello, " + name);
        for (String msg : messages) {
            System.out.println(" -> " + msg);
        }
    }
}