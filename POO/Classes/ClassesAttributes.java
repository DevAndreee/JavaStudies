/*
 Classes – Attributes (also called Fields or Properties)

 1. What are attributes?
 - Attributes are variables declared inside a class. 
 - They represent the *state* or *characteristics* of an object.
 - Each object created from a class has its own copy of the attributes.

 Analogy:
 - Think about a "Car" class.
   Each real car has its own brand, model, and year. 
   These are attributes that make each object unique.

 2. Syntax
 class ClassName {
     // type attributeName;
     String brand;
     int year;
     boolean isElectric;
 }

 3. Default values of attributes:
 - If you don't assign values, Java automatically gives default values:
   • int, byte, short, long = 0
   • float, double = 0.0
   • boolean = false
   • char = '\u0000' (empty unicode)
   • reference types (like String) = null

 Example: 
 If you create a new Car without assigning values, its brand will be null, year will be 0.
*/

class Car {
    // Attributes (state of the object)
    String brand;
    String model;
    int year;
    boolean isElectric;

    void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Is electric? " + isElectric);
    }
}

public class ClassesAttributes {
    public static void main(String[] args) {
        // First object
        Car car1 = new Car();
        car1.brand = "Tesla";
        car1.model = "Model 3";
        car1.year = 2022;
        car1.isElectric = true;
        car1.showInfo();

        System.out.println("------");

        // Second object (different attributes)
        Car car2 = new Car();
        car2.brand = "Toyota";
        car2.model = "Corolla";
        car2.year = 2018;
        car2.isElectric = false;
        car2.showInfo();

        System.out.println("------");

        // Third object (no values assigned yet, will show defaults)
        Car car3 = new Car();
        car3.showInfo();
    }
}

/*
 4. Key takeaways:
 - Attributes = variables inside the class, each object has its own.
 - If you don’t assign values, Java provides defaults.
 - Objects created from the same class can have totally different states.

 5. Questions to reflect:
 - What happens if you create 100 cars? Do they share attributes?
 - What if you change car1.year after creating car2? Does it affect car2?
 - Why does car3 show "null" for brand instead of an empty string?
 - Can attributes be initialized directly inside the class (e.g., int year = 2023;)? Try it.

 6. Challenge exercise:
 Create a class "Student" with attributes:
 - name (String), age (int), grade (double), isApproved (boolean).
 Then, create two different students, assign values, and print their info.
*/