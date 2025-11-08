
The break statement is used to immediately exit a loop or switch when a specific condition is met.
It stops the current iteration flow and jumps to the next code block after the loop or switch.


public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) break;
            System.out.println("i: " + i);
        }
    }
}

EXPLANATION  
The break statement terminates the nearest enclosing loop (for, while, do-while) or a switch statement.  
Execution continues from the first statement after the terminated block.  

Syntax:  
break;  

QUICK REFERENCE  
- Exits the loop or switch immediately.  
- Often used with conditional checks inside loops.  
- Cannot be used outside a loop or switch.  

COMMON MISTAKES  
- Placing break outside a valid control structure.  
- Using break when you actually want to skip (use `continue` instead).  

LEARN MORE  
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html