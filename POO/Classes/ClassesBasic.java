/*
 Introduction to Classes in Java

 1. What is a class?
 A class is a blueprint (template) used to create objects. 
 It defines *what an object is* (its data/attributes) and *what it can do* (its behavior/methods).

 Analogy:
 - Imagine "Car" as an idea (blueprint).
 - Real cars you see (Toyota Corolla, Tesla Model 3) are objects created from this blueprint.

 2. Syntax
 public class ClassName {
     // attributes (variables inside the class)
     // methods (functions inside the class)
 }

 3. Important rules:
 - Class names should start with an uppercase letter (Car, Student, BankAccount).
 - One class per file (usually).
 - The file name must match the public class name (Car.java -> class Car).
 - Attributes and methods are declared *inside* the class.

 4. Example (simple)
*/

class Car {
    // attributes (characteristics)
    String brand;
    String model;
    int year;

    // method (behavior)
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

/*
 5. Key ideas learned:
 - Class = template
 - Object = created instance
 - Attributes = characteristics
 - Methods = actions

 6. Exercises to reflect:
 - Create another object (car2) and assign it different values. 
   Does it affect car1?
 - What happens if you try to print car1 directly (System.out.println(car1))?
 - Can a class exist without attributes? Without methods?
 - Try removing the "public" from the Classes_Basics class. Why does Java require 
   the file name to match the public class?
*/