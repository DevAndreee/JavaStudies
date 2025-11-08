
Switch statement is used to select one block of code among many based on a single variable’s value.
It simplifies multiple "if-else" comparisons when checking discrete values like numbers, enums, or strings.
Each case represents a possible value to match, and "break" prevents execution from continuing into the next case.


public class SwitchCase {

    public static void main(String[] args) {

        int day = 3;
        String msg = "";

        switch (day) {
            case 1:
                msg = "Sunday";
                break;
            case 2:
                msg = "Monday";
                break;
            case 3:
                msg = "Tuesday";
                break;
            case 4:
                msg = "Wednesday";
                break;
            default:
                msg = "Invalid day";
                break;
        }

        System.out.println(msg);
    }
}

EXPLANATION  
Switch selects one block of code to execute based on a variable's value.  
Each `case` is tested sequentially until a match is found.  
When `break` is omitted, execution continues (“fall-through”) into the next case.  
`default` is executed when no case matches.  

Syntax:  
switch (expression) {  
 case value1:  
  // code  
  break;  
 case value2:  
  // code  
  break;  
 default:  
  // fallback code  
  break;  
}  

QUICK REFERENCE  
- Use `switch` for multiple discrete value comparisons.  
- Valid types: `byte`, `short`, `int`, `char`, `enum`, `String`, wrapper types.  
- Break stops the execution of the current case.  
- Default is optional but recommended.  

COMMON MISTAKES  
- Forgetting `break`, causing unintended fall-through.  
- Using incompatible data types in switch expression.  
- Forgetting to handle a default case.  

LEARN MORE  
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html