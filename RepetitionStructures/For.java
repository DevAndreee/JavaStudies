
The for loop is ideal when you know exactly how many times you want to repeat an action.  
It combines initialization, condition checking, and updating in a single line.


public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Index: " + i);
        }
    }
}

EXPLANATION  
The for loop consists of three parts:  
1. **Initialization** – executed once before the loop starts (e.g., `int i = 0`)  
2. **Condition** – checked before every iteration (e.g., `i < 3`)  
3. **Update** – executed after each iteration (e.g., `i++`)  

Syntax:  
for (initialization; condition; update) {  
    // code block  
}  

QUICK REFERENCE  
- Use when the number of repetitions is known.  
- Each section of the header can be omitted, but semicolons are mandatory.  
- Variables declared inside the header exist only within the loop scope.  

COMMON MISTAKES  
- Forgetting to update the loop variable → infinite loop risk.  
- Misplacing semicolons (`for(...);`) which causes empty loops.  

LEARN MORE  
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html