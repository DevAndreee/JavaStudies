
The continue statement skips the current iteration of a loop when a specific condition is met.  
Instead of stopping the loop (like break), it immediately moves to the next iteration.  


public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) continue;
            System.out.println("i: " + i);
        }
    }
}

EXPLANATION  
The continue statement tells the program to skip the rest of the current iteration and proceed directly to the next one.  
It’s commonly used when certain values should be ignored or filtered out inside a loop.  

Syntax:  
continue;  

QUICK REFERENCE  
- Used inside loops only.  
- Skips to the next iteration of the loop.  
- Does not exit the loop.  

COMMON MISTAKES  
- Confusing `continue` with `break`.  
  (`break` stops the loop entirely, while `continue` only skips one iteration.)  

LEARN MORE  
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html