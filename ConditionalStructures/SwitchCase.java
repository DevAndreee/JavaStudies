public class SwitchCase{
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

/*
SWITCH | selects a block of code to execute based on the value of a variable.
- Each `case` is compared to the switch expression.
- `break` prevents fall-through to the next case.
- `default` runs if no case matches.

Supported types:
- byte, short, int, char
- enum (since Java 5)
- String (since Java 7)
- Wrapper classes (Byte, Short, Integer, Character) and String, from Java 7+
*/