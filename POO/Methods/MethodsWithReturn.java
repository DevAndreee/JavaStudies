/*
 The return statement allows a method to **return a value** to the calling point
 Syntax: returnType methodName(parameters) { return value; }
 Rules:
  - The return type of the method must **match the type of the returned value**
  - Void methods **do not use return with a value**, only `return;` to exit
  - A method can have **multiple return statements** in different branches (like if/else)
 Advantages:
  - Allows the result of calculations or operations to be used elsewhere in the code
  - Makes methods more reusable
 Common mistakes:
  - Forgetting to return a value in a non-void method
  - Returning a type different from the declared type
  - Placing code after a return that will never execute
*/

public class MethodsWithReturn {
    public static void main(String[] args) {

        // Example 1: method returning int
        int product = multiply(5, 4);
        System.out.println("Product: " + product);

        // Example 2: method returning boolean
        boolean adult = isAdult(20);
        System.out.println("Is adult? " + adult);

        // Example 3: method returning String
        String greeting = createGreeting("André");
        System.out.println(greeting);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static boolean isAdult(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static String createGreeting(String name) {
        return "Hello, " + name + "!";
    }
}