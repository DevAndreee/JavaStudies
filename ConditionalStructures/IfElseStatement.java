The if–else structure allows a program to choose between two execution paths.
If the condition is true, the code inside the "if" block runs; otherwise, the "else" block runs.

public class IfElseStatement {
    public static void main(String[] args) {

        int age = 18;

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
    }
}

EXPLANATION
- "if" evaluates a boolean condition.
- If the condition is true, its block executes.
- "else" executes when the "if" condition is false.
- Both blocks are mutually exclusive — only one runs.

QUICK REFERENCE
Syntax:
if (condition) {
    // executes if true
} else {
    // executes if false
}

COMMON MISTAKES
- Forgetting braces when using multiple statements.
- Using assignment (=) instead of comparison (==) in the condition.
- Overcomplicating conditions that can be simplified.

LEARN MORE
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html