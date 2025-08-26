/*
 Classes – Constructors

 1. What is a constructor?
 - A constructor is a special method used to initialize objects.
 - It has the same name as the class and NO return type.
 - It's automatically called when using "new".

 Analogy:
 - Class: Car
 - Constructor: the "factory setup" that defines how the car is created 
   (e.g., setting the brand, year, initial speed).

 2. Syntax:
 class ClassName {
     // constructor
     ClassName(parameters) {
         // initialization code
     }
 }
*/

class Car {
    String brand;
    int year;
    int speed;

    // Default constructor (no parameters)
    Car() {
        brand = "Unknown";
        year = 2000;
        speed = 0;
        System.out.println("A car was created with default values.");
    }

    // Constructor with parameters
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.speed = 0; // every new car starts with speed 0
        System.out.println("Car created: " + brand + " (" + year + ")");
    }

    void accelerate(int increment) {
        speed += increment;
        System.out.println(brand + " accelerated to " + speed + " km/h");
    }

    int getSpeed() {
        return speed;
    }
}

public class ClassesConstructors {
    public static void main(String[] args) {
        // Using default constructor
        Car car1 = new Car();
        car1.accelerate(20);

        System.out.println("-----");

        // Using parameterized constructor
        Car car2 = new Car("Tesla", 2022);
        car2.accelerate(50);
        System.out.println("Final speed: " + car2.getSpeed() + " km/h");

        System.out.println("-----");

        // Another example
        Car car3 = new Car("Ferrari", 2023);
        car3.accelerate(100);
    }
}

/*
 3. Key takeaways:
 - Constructors set the initial state of an object.
 - You can overload constructors (several versions with different parameters).
 - "this" is used to differentiate between class attributes and parameters.
 - If no constructor is created, Java automatically provides a default one.

 4. Questions to reflect:
 - What happens if I don’t declare any constructor?
 - Why is "this" important in parameterized constructors?
 - Can I call one constructor from another? (Yes, using "this()")

 5. Challenge exercise:
 Create a class "Student" with attributes:
 - name, age, grade
 Add two constructors:
 - One default (sets generic values)
 - One parameterized (receives values for all attributes)
 Then create students using both constructors and print their info.
*/