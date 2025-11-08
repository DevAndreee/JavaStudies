
package POO.Methods;

======================
CONCEPT INTRODUCTION
======================

Methods in Java can receive input values called parameters, which allow
methods to perform actions or calculations with different data each time
they are called.

Parameters make methods flexible and reusable by enabling the same method
logic to work with different input values. Understanding how primitive
parameters work is fundamental to writing effective methods.

Primitive parameters include: byte, short, int, long, float, double, char, boolean

When you pass primitive values to a method, Java passes a COPY of the value,
not the original variable. This means changes to the parameter inside the
method do not affect the original variable in the caller.

Two categories of methods with primitive parameters:
- Void methods: perform an action using the input values
- Return methods: compute a result using the input values and return it

Syntax:
returnType methodName(primitiveType param1, primitiveType param2) { }

public class MethodsWithPrimitiveParameters {
    
    public static void main(String[] args) {

        printSum(10, 20);

        int result = multiply(5, 7);
        System.out.println("Product: " + result);

        double divisionResult = divide(10.0, 2.0);
        System.out.println("Division result: " + divisionResult);

        boolean isEven = checkEven(8);
        System.out.println("Is 8 even? " + isEven);

        int original = 100;
        System.out.println("Before method call: " + original);
        tryToModify(original);
        System.out.println("After method call: " + original);
    }

    public static void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double numerator, double denominator) {
        return numerator / denominator;
    }

    public static boolean checkEven(int number) {
        return number % 2 == 0;
    }

    public static void tryToModify(int value) {
        value = 999;
        System.out.println("Inside method: " + value);
    }
}

======================
EXPLANATION
======================

EXPLANATION:
- Parameters are variables declared in the method signature that receive values when the method is called
- Primitive parameters receive a copy of the value, not a reference to the original variable
- This means modifying a primitive parameter inside a method does not affect the original variable
- The method signature defines how many parameters the method expects and what types they must be
- When calling a method, you must provide arguments that match the parameter types in order
- Parameters act as local variables inside the method scope and exist only during method execution
- Multiple parameters are separated by commas in both declaration and invocation
- Methods can have zero, one, or multiple parameters of the same or different primitive types

The printSum method is void, meaning it performs an action (printing) but returns nothing.
It takes two int parameters and uses them to calculate and display their sum. You cannot
capture a value from this method because it does not return anything.

The multiply method returns an int, allowing you to capture and use the result. When you
call multiply(5, 7), Java creates copies of the values 5 and 7, passes them to the method,
computes 5 * 7, and returns 35 to the caller where it can be assigned to a variable.

The tryToModify method demonstrates that primitive parameters are passed by value. Even
though the method changes 'value' to 999 inside the method, the original variable in main
remains 100. The parameter 'value' is a separate copy that exists only within the method.

Expected Output:
Sum: 30
Product: 35
Division result: 5.0
Is 8 even? true
Before method call: 100
Inside method: 999
After method call: 100

Notice that the original variable remains 100 even after tryToModify runs, proving
that primitive parameters are passed by value, not by reference.

QUICK REFERENCE:
void method(int x)      → method with parameter, no return value
int method(int x)       → method with parameter and return value
method(10, 20)         → calling method with arguments
Pass by value          → primitives are copied, original unchanged
Multiple parameters    → separated by commas in declaration and call

COMMON MISTAKES:
- Expecting primitive parameter changes to affect the original variable (they do not)
- Wrong data type for parameters (int where double is expected causes compilation error)
- Forgetting to pass required arguments when calling the method (compilation error)
- Passing arguments in wrong order when types match but semantics differ
- Confusing parameters (in method declaration) with arguments (values passed when calling)

LEARN MORE:
https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
(Section: Passing Information to a Method or a Constructor)
```