/*
    Constructors Basics

    What is a constructor?
    - A constructor is a special method used to initialize an object when it is created with the `new` keyword.
    - Its name must be exactly the same as the class name.
    - Unlike regular methods, it has no return type (not even void).

    Why use a constructor?
    - To ensure that an object starts in a valid state.
    - To initialize attributes directly at the moment of object creation.

    Syntax:
    class ClassName {
        // Constructor
        ClassName() {
            // initialization logic
        }
    }

    Important:
    - If you don't declare any constructor, Java automatically provides a default one with no parameters.
    - If you declare any constructor, the default no-argument constructor is NOT automatically created anymore.
*/

class Car {
    String model;
    int year;

    // Constructor (no-argument constructor)
    Car() {
        model = "Undefined";
        year = 0;
    }

    void showInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class ConstructorsBasics {
    public static void main(String[] args) {
        // Creating a Car object -> constructor is automatically called
        Car car1 = new Car();

        // The constructor set default values
        car1.showInfo();
    }
}

/*
    Output:
    Model: Undefined, Year: 0

    Explanation:
    - When `new Car()` is executed, Java calls the constructor `Car()`.
    - This constructor initializes `model` as "Undefined" and `year` as 0.
    - After that, we can call methods normally.
*/