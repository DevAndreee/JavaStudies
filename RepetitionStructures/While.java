
The while loop repeats a block of code as long as the given condition is true.  
It checks the condition before every iteration, so if it’s false initially, the loop never runs.


public class While {
    public static void main(String[] args) {
        int counter = 0;

        while (counter < 3) {
            System.out.println("Count: " + counter);
            counter++;
        }
    }
}

EXPLANATION  
The **while** loop executes repeatedly while its condition evaluates to `true`.  
When the condition becomes `false`, the loop ends.  

Syntax:  
while (condition) {  
    // code block  
}  

QUICK REFERENCE  
- Use when the number of iterations is **unknown**.  
- Condition is evaluated **before** the loop body.  
- Can result in a **zero-execution loop** if the condition is initially false.  

COMMON MISTAKES  
- Forgetting to modify the loop variable → infinite loop.  
- Using `=` instead of `==` in the condition.  
- Not initializing variables before the loop.  

LEARN MORE  
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html