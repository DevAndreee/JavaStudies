public class Ternary {
    public static void main(String[] args) {

        int number = 10;

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(result); //Even
    }
}

/*
TERNARY → short form of if...else that returns a value.
Syntax: condition ? value_if_true : value_if_false;
- Useful when assigning a value based on a condition in a single line.
*/