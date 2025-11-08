
package POO.Methods;

======================
CONCEPT INTRODUCTION
======================

Method overloading means creating multiple methods in the same class
with the same name but different parameter lists (different number,
type, or order of parameters).

This allows flexibility and improves code readability by using the same
method name for similar operations on different types of data. The correct
method is chosen automatically at compile time based on the arguments passed.

Overloading rules:
- Methods must have the SAME name
- Methods must have DIFFERENT parameter lists (number, type, or order)
- Return type alone is NOT sufficient to overload a method
- Access modifiers can be different but are not part of the overloading decision

Syntax:
returnType methodName(Type1 param1) { }
returnType methodName(Type2 param2) { }
returnType methodName(Type1 param1, Type2 param2) { }

public class MethodsOverloading {

    public void print(int value) {
        System.out.println("Printing int: " + value);
    }

    public void print(double value) {
        System.out.println("Printing double: " + value);
    }

    public void print(String value) {
        System.out.println("Printing String: " + value);
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    public double calculate(int a, double b) {
        return a + b;
    }

    public double calculate(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodsOverloading example = new MethodsOverloading();

        System.out.println("=== Example 1: Different parameter types ===");
        example.print(10);
        example.print(10.5);
        example.print("Hello");

        System.out.println("\n=== Example 2: Different number of parameters ===");
        System.out.println("Sum 2 numbers: " + example.sum(2, 3));
        System.out.println("Sum 3 numbers: " + example.sum(2, 3, 4));

        System.out.println("\n=== Example 3: Varargs ===");
        System.out.println("Sum varargs: " + example.sum(1, 2, 3, 4, 5));

        System.out.println("\n=== Example 4: Different parameter order ===");
        System.out.println("calculate(5, 2.5): " + example.calculate(5, 2.5));
        System.out.println("calculate(2.5, 5): " + example.calculate(2.5, 5));
    }
}

======================
EXPLANATION
======================

EXPLANATION:
- Method overloading is a form of compile-time polymorphism also called static polymorphism
- The compiler determines which overloaded method to call based on the method signature at compile time
- Method signature consists of the method name and parameter list (number, type, and order)
- Two methods cannot have the same name and parameter list even if they have different return types
- Overloading makes code more intuitive by using the same method name for conceptually similar operations
- Java automatically chooses the most specific matching method based on the arguments provided
- Varargs can participate in overloading but may cause ambiguity with array parameters
- Overloading is commonly used in constructors, utility methods, and API design

When you call example.print(10), Java sees you passed an int, so it calls the print(int) version.
When you call example.print(10.5), Java sees a double and calls print(double). The method name
is the same, but Java distinguishes them by their parameter types.

The sum methods demonstrate overloading by number of parameters. sum(int, int) handles two numbers,
sum(int, int, int) handles three numbers, and sum(int...) handles any number using varargs.
When you call sum(2, 3), Java matches it to the two-parameter version because it is more specific
than the varargs version.

The calculate methods show overloading by parameter order. calculate(int, double) is different from
calculate(double, int) because the order of parameter types differs. Java treats these as distinct
method signatures even though they perform similar operations.

Expected Output:
=== Example 1: Different parameter types ===
Printing int: 10
Printing double: 10.5
Printing String: Hello

=== Example 2: Different number of parameters ===
Sum 2 numbers: 5
Sum 3 numbers: 9

=== Example 3: Varargs ===
Sum varargs: 15

=== Example 4: Different parameter order ===
calculate(5, 2.5): 7.5
calculate(2.5, 5): 7.5

QUICK REFERENCE:
Same name, different parameters → valid overloading
Different return type only      → NOT valid overloading
Compile-time resolution        → Java decides which method at compilation
Parameter order matters        → method(int, double) differs from method(double, int)
Varargs and overloading        → can cause ambiguity, use carefully

COMMON MISTAKES:
- Trying to overload based only on return type (compilation error - not a valid overload)
- Creating ambiguous overloads where Java cannot determine which method to call
- Confusing overloading (compile-time) with overriding (runtime, used in inheritance)
- Forgetting that parameter names do not matter for overloading (only types and order)
- Creating too many overloaded versions making code harder to maintain

LEARN MORE:
https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
(Section: Defining Methods - Overloading Methods)
```