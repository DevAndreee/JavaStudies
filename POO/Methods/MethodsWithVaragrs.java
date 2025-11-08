
package POO.Methods;

======================
CONCEPT INTRODUCTION
======================

Varargs (variable arguments) allow a method to accept a flexible
number of parameters of the same type, making method calls more
convenient and reducing the need for method overloading.

Instead of creating multiple versions of a method for different numbers
of parameters, or forcing callers to create arrays, varargs provides
a cleaner syntax that handles variable parameter counts automatically.

Rules:
- A method can have only ONE varargs parameter
- The varargs MUST be the last parameter in the method signature
- Inside the method, the varargs is treated as an ARRAY
- You can call the method with zero, one, or many arguments

Syntax:
returnType methodName(type... paramName) { }

public class MethodsWithVarargs {
    
    public static void main(String[] args) {

        System.out.println("Sum with zero arguments: " + sum());
        System.out.println("Sum with one argument: " + sum(5));
        System.out.println("Sum with multiple arguments: " + sum(1, 2, 3, 4));

        System.out.println("\nPrinting messages:");
        printMessages("Hi");
        printMessages("Hi", "How are you?", "Bye");

        System.out.println("\nGreeting with varargs:");
        greet("André", "Welcome!", "Enjoy the class!");
    }

    public static int sum(int... numbers) {
        int result = 0;
        for (int n : numbers) {
            result += n;
        }
        return result;
    }

    public static void printMessages(String... msgs) {
        for (String msg : msgs) {
            System.out.println(msg);
        }
    }

    public static void greet(String name, String... messages) {
        System.out.println("Hello, " + name);
        for (String msg : messages) {
            System.out.println(" -> " + msg);
        }
    }
}

======================
EXPLANATION
======================

EXPLANATION:
- Varargs provide syntactic sugar for methods that need to accept a variable number of arguments
- The three dots (...) syntax tells Java to treat the parameter as an array internally
- When you call a varargs method, you can pass any number of arguments (including zero)
- Java automatically packages your arguments into an array behind the scenes
- Inside the method body, you work with the varargs parameter exactly like an array
- Varargs are particularly useful for utility methods like sum, min, max, or formatting functions
- They eliminate the need for method overloading when the only difference is parameter count

The difference between arrays and varargs in practice:
- With arrays: sum(new int[]{1, 2, 3}) - explicit array creation required
- With varargs: sum(1, 2, 3) - cleaner syntax, no explicit array needed

When you have multiple parameters, the varargs must always be last because Java needs
to know where the fixed parameters end and where the variable parameters begin.
For example, greet(String name, String... messages) is valid, but
greet(String... messages, String name) would cause a compilation error.

Expected Output:
Sum with zero arguments: 0
Sum with one argument: 5
Sum with multiple arguments: 10

Printing messages:
Hi
Hi
How are you?
Bye

Greeting with varargs:
Hello, André
 -> Welcome!
 -> Enjoy the class!

QUICK REFERENCE:
type... paramName        → varargs parameter declaration
method()                 → call with zero arguments
method(arg1, arg2, ...)  → call with multiple arguments
Access as array          → use loops or array indexing inside method
Position rule            → varargs must be the last parameter

COMMON MISTAKES:
- Trying to use multiple varargs in one method (only one varargs per method allowed)
- Placing varargs before other parameters (varargs must be last)
- Confusing varargs with overloading (varargs reduces need for overloading)
- Forgetting that varargs is actually an array inside the method (can be null or empty)
- Attempting to modify the varargs array thinking it affects original values (it does not for primitives)

LEARN MORE:
https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
(Section: Arbitrary Number of Arguments)
```