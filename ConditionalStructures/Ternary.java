
The ternary operator is a compact form of the if...else statement used to assign a value based on a condition.
It helps simplify conditional assignments into a single, concise line.


public class Ternary {

    public static void main(String[] args) {
        int number = 10;

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(result); // Even
    }
}

EXPLANATION  
The ternary operator checks a condition and returns one of two values depending on whether it’s true or false.  
It’s most commonly used to replace short if...else statements in assignments.  

Syntax:  
variable = (condition) ? value_if_true : value_if_false;  

QUICK REFERENCE  
- Returns a value based on a condition.  
- Shorthand replacement for simple if...else.  
- Must always return a value of the same or compatible type.  

COMMON MISTAKES  
- Using it for complex logic (hurts readability).  
- Forgetting parentheses when nesting ternary operations.  
- Returning values of incompatible types.  

LEARN MORE  
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html