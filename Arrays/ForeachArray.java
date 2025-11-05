public class ForeachArray {
    public static void main(String[] args) {

        // 'foreach' is a simplified way to iterate through arrays when the index is not needed.

        // Example with a String array
        String[] names = {"Ana", "Leo", "João"};
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        // Example with an int array
        int[] numbers = {10, 20, 30};
        for (int number : numbers) {
            System.out.println("Value: " + number);
        }

        // Trying to modify array values using foreach (won't work)
        for (int number : numbers) {
            number = number * 2; // This does NOT change the original array values
        }

        // Check if values changed
        System.out.println("After modification attempt:");
        for (int number : numbers) {
            System.out.println(number); // Still prints 10, 20, 30
        }
    }
}

/*
FOREACH:
- Iterates over all elements in the array.
- Syntax: for (type variable : array) { ... }
- Simpler than the traditional 'for' when the index is not needed.
- Works with primitive arrays and object arrays (like String[]).
- Does NOT allow direct access to the index.
- Does NOT allow modifying the original elements of the array.
*/