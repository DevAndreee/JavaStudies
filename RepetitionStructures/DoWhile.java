public class DoWhile {
    public static void main(String[] args) {
        int counter = 0;

        do {
            System.out.println("Count: " + counter);
            counter++;
        } while (counter < 3);
    }
}

/*
DO-WHILE → Repeats a block while the condition is true.
- Executes at least once, even if the condition is false.
- Condition is checked after the loop body.
*/