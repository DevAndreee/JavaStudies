
package POO.Methods;

======================
CONCEPT INTRODUCTION
======================

Methods in Java are reusable blocks of code that perform specific tasks.
They are fundamental building blocks that help organize code, avoid repetition,
and make programs more maintainable and readable.

Methods allow you to encapsulate logic into named units that can be called
multiple times from different parts of your program. Understanding methods
is essential for writing clean, professional Java code.

Purpose of methods:
- Organize code into logical units
- Reuse code without duplication
- Provide cohesion and structure in programs
- Make testing and debugging easier
- Improve readability by giving meaningful names to operations

Two main categories:
1. Void methods: perform an action, do not return a value
2. Return methods: compute or produce a result, return a value of declared type

Syntax:
void methodName() { }
returnType methodName() { return value; }

public class MethodsBasics {
    
    public static void main(String[] args) {

        System.out.println("=== Void method examples ===");
        sayHello();
        showMessage("Learning Java!");

        System.out.println("\n=== Methods with return ===");
        int value = getNumber();
        System.out.println("Returned value: " + value);

        int sum = add(10, 20);
        System.out.println("Sum: " + sum);

        System.out.println("\n=== Using return value directly ===");
        System.out.println("Direct calculation: " + multiply(5, 7));

        System.out.println("\n=== Method calling another method ===");
        demonstrateMethodCalls();
    }

    public static void sayHello() {
        System.out.println("Hello, welcome!");
    }

    public static int getNumber() {
        return 42;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void showMessage(String msg) {
        System.out.println("Message: " + msg);
    }

    public static void demonstrateMethodCalls() {
        int result = add(5, 10);
        System.out.println("Method calling another method result: " + result);
    }
}

======================
EXPLANATION
======================

EXPLANATION:
- Methods are declared inside classes and define reusable units of functionality
- Method declaration consists of access modifier, return type, method name, and parameter list
- Void methods execute code but do not produce a value to return to the caller
- Methods with return types must return a value matching the declared return type
- The 'static' keyword allows methods to be called without creating an object instance
- Methods can call other methods, creating chains of functionality
- Parameters allow methods to receive input data and work with different values
- Method names should be descriptive verbs or verb phrases that clearly indicate what the method does

When you write 'sayHello();' in main, Java jumps to the sayHello method, executes all
its statements, and then returns control back to main at the point where it was called.
For void methods, no value comes back, just the execution of the code inside the method.

When you write 'int value = getNumber();', Java executes getNumber, encounters the return
statement with value 42, and sends that value back to main where it is assigned to the
variable 'value'. The method has produced a result that can be stored and used.

Methods can call other methods. In demonstrateMethodCalls(), the method calls add(5, 10)
and uses the returned value. This composition of methods is fundamental to building
complex programs from simple building blocks.

Expected Output:
=== Void method examples ===
Hello, welcome!
Message: Learning Java!

=== Methods with return ===
Returned value: 42
Sum: 30

=== Using return value directly ===
Direct calculation: 35

=== Method calling another method ===
Method calling another method result: 15

QUICK REFERENCE:
void methodName()           → method that performs action, returns nothing
returnType methodName()     → method that returns a value
static                     → allows calling method without object instance
methodName()               → calling a void method
variable = methodName()    → capturing return value from method

COMMON MISTAKES:
- Forgetting to call the method (just declaring it does nothing)
- Using return in void methods with a value (compilation error)
- Not returning a value in non-void methods (compilation error)
- Forgetting 'static' when calling methods from static main (compilation error)
- Trying to use void method return value in an assignment (void has no value to assign)

LEARN MORE:
https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
(Section: Defining Methods)
```