public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) continue;
            System.out.println("i: " + i);
        }
    }
}

/*
CONTINUE → Skips the current iteration of the loop.
- Proceeds to the next loop cycle directly.
*/