/*
 Methods in Java can also receive **reference parameters**
 Reference parameters allow the method to **modify objects** or **access complex data**
 Examples of reference types: String, Arrays, Custom Objects
 Void methods with reference parameters:
  - Can change the state of the object or print information
 Methods with return and reference parameters:
  - Can process the object and return a result or a new object
 Advantages:
  - Make methods more powerful and flexible
  - Allow manipulating objects without duplicating code
 Common mistakes:
  - Modifying objects unintentionally (side effect)
  - Confusing pass-by-reference with pass-by-value
  - Forgetting to instantiate objects before use
*/

public class MethodsWithReferenceParameters {
    public static void main(String[] args) {

        // Example 1: void with String parameter
        String message = "Learning Java";
        printMessage(message);

        // Example 2: void with Array parameter
        int[] numbers = {1, 2, 3};
        printArray(numbers);

        // Example 3: method with return using String object
        String originalText = "java is fun";
        String upperText = toUpperCase(originalText);
        System.out.println("Uppercase text: " + upperText);
    }

    // Void method with String parameter
    public static void printMessage(String msg) {
        System.out.println("Message: " + msg);
    }

    // Void method with Array parameter
    public static void printArray(int[] arr) {
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method with return using String parameter
    public static String toUpperCase(String text) {
        return text.toUpperCase();
    }
}