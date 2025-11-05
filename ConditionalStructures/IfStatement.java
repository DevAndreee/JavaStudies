public class IfStatement {
    public static void main (String[] args){

        // Direct condition check
        int valueA = 10;
        if (valueA > 5) {
            System.out.println("greater than 5");
        }

        // Condition using a boolean variable
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

/*
IF → conditional structure that runs a block of code if the condition is true.
- You can use direct expressions (e.g., value > 10) or boolean variables.
- The block only runs when the condition is `true`.
- You can use the `!` operator to invert a boolean value (e.g., !validator).
*/