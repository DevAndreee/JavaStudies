IF → conditional structure that runs a block of code if the condition is true.

public class IfStatement {
    public static void main(String[] args) {

        int valueA = 10;
        if (valueA > 5) {
            System.out.println("greater than 5");
        }

        int valueB = 20;
        boolean validator = valueB < 30;
        if (validator) {
            System.out.println("less than 30");
        }
        if (!validator) {
            System.out.println("greater than 30");
        }
    }
}

EXPLANATION
The if statement checks whether a condition is true before executing a block of code.
You can compare values directly or store a condition result in a boolean variable.
Using ! inverts the logical value (true → false, false → true).

QUICK REFERENCE
Syntax: if (condition) { code }
Condition: must return a boolean (true or false)
You can invert with !, e.g. if (!validator)

COMMON MISTAKES
- Using = instead of == in comparisons
- Forgetting the braces {} for multi-line blocks
- Confusing = (assignment) with == (comparison)