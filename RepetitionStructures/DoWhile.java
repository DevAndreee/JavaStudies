
The do-while loop executes a block of code at least once,  
and then continues repeating it as long as the condition remains true.  
Unlike a regular while loop, the condition is evaluated **after** the loop body.  


public class DoWhile {
    public static void main(String[] args) {
        int counter = 0;

        do {
            System.out.println("Count: " + counter);
            counter++;
        } while (counter < 3);
    }
}

EXPLANATION  
The do-while loop guarantees that the code block runs at least once.  
After executing the loop body, the condition is evaluated —  
if it’s true, the loop repeats; if false, the program continues.  

Syntax:  
do {  
    // code block  
} while (condition);  

QUICK REFERENCE  
- Executes **before** checking the condition (at least once).  
- Ends when the condition becomes false.  
- Useful when user input or one guaranteed execution is needed.  

COMMON MISTAKES  
- Forgetting the semicolon (`;`) after the while condition.  
- Expecting it to behave exactly like a `while` loop (it doesn’t).  

LEARN MORE  
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html