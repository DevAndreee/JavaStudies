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
        System.out.println(grade); // grade == B
    }
}

/*
IF...ELSE IF...ELSE → used when there are multiple conditions to check in sequence.
- Only the first true condition is executed.
- The `else` at the end acts as a fallback if none are true.
*/