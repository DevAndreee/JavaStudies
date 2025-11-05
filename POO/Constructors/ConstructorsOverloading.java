/*
    Constructors Overloading

    What is constructor overloading?
    - You can have multiple constructors in the same class with the SAME name,
      but different parameter lists (number or types of parameters).
    - The compiler chooses which constructor to call based on the arguments passed.
    - Helps to create objects in different ways without duplicating code.

    Key points:
    - Overloading is determined by parameter types or number.
    - Return type is not used in constructor overloading.
    - Overloading improves flexibility and readability.
*/

class Car {
    String model;
    int year;
    String color;

    // Constructor 1: no parameters
    public Car() {
        this.model = "Undefined";
        this.year = 0;
        this.color = "Undefined";
    }

    // Constructor 2: model and year
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Undefined";
    }

    // Constructor 3: model, year and color
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void showInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}

public class ConstructorsOverloading {
    public static void main(String[] args) {
        Car car1 = new Car();                       // Calls constructor 1
        Car car2 = new Car("Civic", 2020);         // Calls constructor 2
        Car car3 = new Car("Corolla", 2023, "Red");// Calls constructor 3

        car1.showInfo();
        car2.showInfo();
        car3.showInfo();
    }
}

/*
    Output:
    Model: Undefined, Year: 0, Color: Undefined
    Model: Civic, Year: 2020, Color: Undefined
    Model: Corolla, Year: 2023, Color: Red

    Explanation:
    - Each constructor is called according to the arguments provided.
    - Overloading avoids duplicating initialization logic.
    - You can create objects with different levels of detail.
*/