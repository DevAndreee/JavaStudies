
package POO.Methods;

======================
CONCEPT INTRODUCTION
======================

Methods in Java can receive reference parameters, which are variables that
hold references to objects rather than primitive values. This allows methods
to work with complex data structures and objects.

Reference parameters enable methods to access and potentially modify objects,
arrays, and other complex data types. Understanding how reference parameters
work is crucial because they behave differently from primitive parameters.

Examples of reference types: String, Arrays, Custom Objects, Collections

Key difference from primitives:
- Primitives: method receives a COPY of the value
- References: method receives a COPY of the reference (address) to the object

This means changes to the object itself (like modifying array elements) affect
the original object, but reassigning the reference parameter does not affect
the original reference in the caller.

Syntax:
returnType methodName(ReferenceType paramName) { }

public class MethodsWithReferenceParameters {
    
    public static void main(String[] args) {

        String message = "Learning Java";
        printMessage(message);

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Before modification:");
        printArray(numbers);
        
        modifyArray(numbers);
        System.out.println("After modification:");
        printArray(numbers);

        String originalText = "java is fun";
        String upperText = toUpperCase(originalText);
        System.out.println("Original: " + originalText);
        System.out.println("Uppercase: " + upperText);

        Person person = new Person("André", 25);
        printPerson(person);
        updateAge(person, 26);
        printPerson(person);
    }

    public static void printMessage(String msg) {
        System.out.println("Message: " + msg);
    }

    public static void printArray(int[] arr) {
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void modifyArray(int[] arr) {
        if (arr.length > 0) {
            arr[0] = 99;
        }
    }

    public static String toUpperCase(String text) {
        return text.toUpperCase();
    }

    public static void printPerson(Person p) {
        System.out.println("Person: " + p.name + ", Age: " + p.age);
    }

    public static void updateAge(Person p, int newAge) {
        p.age = newAge;
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

======================
EXPLANATION
======================

EXPLANATION:
- Reference parameters pass a copy of the reference (memory address) to the method, not the object itself
- This means the method can access and modify the actual object that the reference points to
- Changes made to object properties or array elements inside the method affect the original object
- However, reassigning the reference parameter to a new object does not affect the caller's reference
- Strings in Java are immutable, so methods cannot modify the original String object content
- Methods that work with String return new String objects rather than modifying the original
- Arrays are mutable, so methods can change array element values, and those changes persist
- Custom objects passed as parameters can have their fields modified by the method

When you pass an array to modifyArray, the method receives a copy of the reference
pointing to the same array in memory. When the method changes arr[0], it modifies
the actual array that 'numbers' in main also references. This is why the change persists.

With String parameters, even though String is a reference type, Strings are immutable.
The toUpperCase method cannot modify the original String. Instead, it creates and returns
a new String object with uppercase characters. The original 'originalText' remains unchanged.

For custom objects like Person, the method receives a reference to the actual Person object.
When updateAge modifies p.age, it changes the age field of the actual Person object that
was passed from main. This change is visible in main after the method returns.

Expected Output:
Message: Learning Java
Before modification:
Array: 1 2 3 4 5 
After modification:
Array: 99 2 3 4 5 
Original: java is fun
Uppercase: JAVA IS FUN
Person: André, Age: 25
Person: André, Age: 26

QUICK REFERENCE:
Reference parameter     → method receives copy of reference to object
Mutable objects        → changes to object state persist after method returns
Immutable objects      → cannot be modified (like String), methods return new objects
Array modification     → changes to elements persist in original array
Reassigning reference  → does not affect caller's reference

COMMON MISTAKES:
- Thinking Java passes objects by reference (it passes references by value)
- Expecting String modifications to persist (Strings are immutable)
- Modifying objects unintentionally causing side effects in other parts of code
- Reassigning a reference parameter and expecting it to affect the caller's variable
- Forgetting to check for null references before using object methods or fields

LEARN MORE:
https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
(Section: Passing Information to a Method or a Constructor)
```