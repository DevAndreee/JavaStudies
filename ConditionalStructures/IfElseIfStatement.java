The if–else if–else structure is used to evaluate multiple conditions in sequence.
Only the first true condition executes its block, and the rest are skipped.
The final "else" acts as a fallback when none of the conditions are true.

public class IfElseIfStatement {
    public static void main(String[] args) {

        int score = 75;
        String grade = "";

        if (score >= 90) {
            grade = "A";
        } else if (score >= 70) {
            grade = "B";
        } else if (score >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }

        System.out.println("Grade: " + grade); // Output: Grade: B
    }
}

EXPLANATION
- "if" checks the first condition.
- "else if" checks additional conditions if the previous ones are false.
- "else" runs only if none of the above conditions are true.
- Execution stops as soon as one condition is met.

QUICK REFERENCE
Syntax:
if (condition1) {
    // code to execute if condition1 is true
} else if (condition2) {
    // code to execute if condition2 is true
} else {
    // code to execute if none are true
}

COMMON MISTAKES
- Using multiple separate "if" statements instead of chaining with "else if".
- Forgetting that only the first true condition executes.
- Misplacing braces {} or indentation, causing logical errors.

LEARN MORE
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html