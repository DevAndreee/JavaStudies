public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) break;
            System.out.println("i: " + i);
        }
    }
}

/*
BREAK → Immediately exits the loop or switch.
- Skips remaining iterations and moves to the next code block.
*/