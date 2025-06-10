public class While {
    public static void main(String[] args) {
        int counter = 0;

        while (counter < 3) {
            System.out.println("Count: " + counter);
            counter++;
        }
    }
}

/*
WHILE → Repeats a block while the condition is true.
- Checks the condition before each iteration.
- May never run if the condition is false at the start.
*/