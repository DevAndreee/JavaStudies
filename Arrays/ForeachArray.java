
-----------------------------------------------------
CONCEPT INTRODUCTION:
-----------------------------------------------------
The 'foreach' loop (also known as the "enhanced for loop") 
is a simplified way to iterate through arrays or collections 
when you don't need to access the index directly.

It improves code readability and reduces errors caused by 
manual index handling.
-----------------------------------------------------


public class ForeachArray {
    public static void main(String[] args) {

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


-----------------------------------------------------
EXPLANATION:
-----------------------------------------------------
- 'foreach' automatically iterates through all elements in the array.
- The variable after the colon (:) represents each element in sequence.
- It’s ideal when you don’t need the index, only the values.
- The array itself cannot be modified directly this way because 
  the variable is a *copy* of each element.

-----------------------------------------------------
QUICK REFERENCE:
-----------------------------------------------------
✅ Purpose:
   → Iterate through all elements of an array or collection without using an index.

✅ Syntax:
   for (DataType variable : arrayName) {
       // code using variable
   }

✅ Example:
   String[] names = {"Ana", "Leo", "João"};
   for (String name : names) {
       System.out.println(name);
   }

✅ When to Use:
   → When you don’t need the index
   → When you just want to *read* array values
-----------------------------------------------------

-----------------------------------------------------
COMMON MISTAKES:
-----------------------------------------------------
❌ Trying to modify the array elements inside a foreach loop:
   for (int n : numbers) { n *= 2; } // Doesn't work

✅ Correct way (using index):
   for (int i = 0; i < numbers.length; i++) {
       numbers[i] *= 2;
   }

❌ Assuming 'foreach' provides access to element indexes
   → It doesn't; use a normal 'for' loop if you need the index.

-----------------------------------------------------
LEARN MORE:
-----------------------------------------------------
🔹 Official Java Docs: 
   https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
🔹 Related Topics:
   - ArraysIntro.java
   - For.java
-----------------------------------------------------
