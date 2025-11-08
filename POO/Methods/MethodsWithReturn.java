
package POO.Methods;

======================
CONCEPT INTRODUCTION
======================

The return statement allows a method to send a value back to the calling point,
making methods capable of computing results that can be used elsewhere in your program.

Methods with return values are fundamental to writing reusable and composable code,
as they enable you to break down complex operations into smaller, testable units
that produce outputs you can work with.

Rules:
- The return type of the method must MATCH the type of the returned value
- Void methods do NOT use return with a value, only 'return;' to exit early
- A method can have MULTIPLE return statements in different branches (like if/else)
- Every execution path in a non-void method must reach a return statement

Syntax:
returnType methodName(parameters) {
    return value;
}

public class MethodsWithReturn {
    
    public static void main(String[] args) {

        int product = multiply(5, 4);
        System.out.println("Product: " + product);

        boolean adult = isAdult(20);
        System.out.println("Is adult? " + adult);

        String greeting = createGreeting("André");
        System.out.println(greeting);

        int max = findMax(10, 25, 15);
        System.out.println("Maximum value: " + max);
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

    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}

======================
EXPLANATION
======================

EXPLANATION:
- A method with a return type other than void MUST return a value of that exact type
- The return statement immediately exits the method and sends the value back to the caller
- The caller can use the returned value directly, assign it to a variable, or pass it to another method
- When Java encounters a return statement, it stops executing the current method and goes back to where the method was called
- Methods can have multiple return statements in different conditional branches, but at least one must be reachable
- The returned value must be assignment-compatible with the declared return type
- Return values enable method chaining and composition, where one method's output becomes another method's input

In the multiply method, when you write 'return a * b;', Java evaluates the expression a * b,
then sends that integer value back to wherever multiply was called. In main, that returned
value is assigned to the variable 'product'.

The isAdult method demonstrates multiple return statements. Depending on the condition,
either 'return true;' or 'return false;' executes. Only one return statement will actually
run for any given method call, but Java verifies that all possible execution paths lead to a return.

You can use returned values immediately without storing them in variables. For example,
System.out.println(multiply(3, 7)) directly passes the return value to println without
creating an intermediate variable.

Expected Output:
Product: 20
Is adult? true
Hello, André!
Maximum value: 25

QUICK REFERENCE:
return value;           → exit method and send value back to caller
returnType methodName   → declare what type the method returns
void methodName         → method returns nothing
return;                → exit void method early (no value)
variableName = method() → capture returned value in variable

COMMON MISTAKES:
- Forgetting to return a value in a non-void method (compilation error)
- Returning a type different from the declared return type (compilation error)
- Writing code after a return statement in the same block (unreachable code warning)
- Not covering all execution paths with return statements (compilation error)
- Declaring return type as void when the method should return a value

LEARN MORE:
https://docs.oracle.com/javase/tutorial/java/javaOO/returnvalue.html
(Section: Returning a Value from a Method)
```