package Arrays;

* Arrays are data structures used to store multiple values
* of the same data type in a single variable.
* Each element can be accessed by its index (starting at 0).


public class ArraysIntro {
    public static void main(String[] args) {
        
        // Declaration and initialization
        String[] names = new String[3]; // Creates an array with 3 positions

        // Assigning values
        names[0] = "Ana";
        names[1] = "Leo";
        names[2] = "João";

        // Accessing elements by index
        System.out.println(names[1]); // Leo

        // Loop through the array using 'for'
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name at index " + i + ": " + names[i]);
        }

         Default values in arrays:
         int → 0
         double → 0.0
         boolean → false
         char → '\u0000'
         Objects (like String) → null

        // Reassigning an array removes previous values
        names = new String[3]; // Creates a new array with 3 empty/null positions

        // Now all previous data ("Ana", "Leo", "João") is lost
        System.out.println("After reassignment: " + names[0]); // null
    }
}


=====================================================
EXPLANATION:
=====================================================
1. Arrays are **fixed-size** containers that hold multiple elements of the same type.
2. The index starts from **0** and ends at **length - 1**.
3. Arrays must be declared with a **data type** and can be initialized in two ways:
   - Explicitly setting the size: `int[] numbers = new int[5];`
   - Inline initialization: `int[] numbers = {1, 2, 3, 4, 5};`
4. The **.length** property returns the number of elements.
5. When a new array is assigned, previous values are lost.

-----------------------------------------------------
QUICK REFERENCE:
-----------------------------------------------------
Syntax:
    type[] arrayName = new type[size];
    arrayName[index] = value;
    System.out.println(arrayName[index]);
    for (int i = 0; i < arrayName.length; i++) { ... }

Examples:
    int[] ages = new int[3];
    String[] fruits = {"Apple", "Banana", "Cherry"};

-----------------------------------------------------
COMMON MISTAKES:
-----------------------------------------------------
❌ Accessing indexes outside array range → ArrayIndexOutOfBoundsException  
❌ Forgetting that array indexes start at 0  
❌ Trying to resize an existing array (use ArrayList instead)  
❌ Using .length() instead of .length (the latter is correct for arrays)

-----------------------------------------------------
Learn more:
-----------------------------------------------------
📘 Official Java Documentation:
🔗 https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
=====================================================
