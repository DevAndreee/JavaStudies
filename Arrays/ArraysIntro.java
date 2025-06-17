public class ArraysIntro {
    public static void main(String[] args) {
        
        // Arrays store multiple values of the same type.
        // Access is done via an index starting from 0.

        // Declaration and initialization
        String[] names = new String[3]; // Creates an array with 3 positions
        
        // Assigning values
        names[0] = "Ana";
        names[1] = "Leo";
        names[2] = "João";
        
        // Accessing elements by index
        System.out.println(names[1]); // Leo

        // Loop through array using 'for'
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name at index " + i + ": " + names[i]);
        }

        // Default values in arrays:
        // int → 0
        // double → 0.0
        // boolean → false
        // char → '\u0000'
        // Objects (like String) → null

        // Reassigning an array removes previous values
        names = new String[3]; // Creates a new array with 3 empty/null positions
        
        // Now all previous data ("Ana", "Leo", "João") is lost
        System.out.println("After reassignment: " + names[0]); // null
    }
}

/*
ARRAYS:
- Arrays are fixed-size structures that store values of the same type.
- Indexes start at 0 and go up to length - 1.
- Arrays must be declared with a type.
- Use .length to know its size.
- Reassigning with 'new' creates a new array and loses previous data.
*/