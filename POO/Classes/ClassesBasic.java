
C L A S S E S — B A S I C  C O N C E P T S

A class is a **blueprint** (or template) for creating objects.  
It defines what an object **is** (its attributes) and what it **can do** (its methods).

Analogy:
Think of "Car" as the idea of a car.
Real cars (like a Tesla or Toyota) are *objects* created from this blueprint.


class Car {
    // Attributes (characteristics)
    String brand;
    String model;
    int year;

    // Method (behavior)
    void showInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}

public class ClassesBasic {
    public static void main(String[] args) {
        // Creating an object from the Car class
        Car car1 = new Car();

        // Setting attributes
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2020;

        // Calling method
        car1.showInfo();
    }
}


EXPLANATION:
- Class = template that defines structure and behavior.
- Object = instance created from a class.
- Attributes = variables inside a class (object data).
- Methods = actions that objects can perform.

Example:
  Car (class) → defines brand, model, and year.
  car1 (object) → a specific car with its own values.

QUICK REFERENCE:
  • Class → defines structure
  • Object → instance of a class
  • Attributes → variables inside a class
  • Methods → functions inside a class
  • File name = public class name

COMMON MISTAKES:
  - Forgetting to use uppercase for class names (should be Car, not car).
  - Declaring multiple public classes in the same file.
  - Expecting objects to share the same attribute values automatically.
  - Printing an object directly (System.out.println(car1)) → shows memory ref, not content.

LEARN MORE:
  - Java Docs: https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html