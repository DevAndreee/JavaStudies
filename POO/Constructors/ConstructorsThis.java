/*
    Constructors This()

    Key points:
    - You can call one constructor from another constructor within the same class using `this()`.
    - Helps avoid repeating initialization code.
    - Must be the FIRST statement in the constructor body.
*/

class Car {
    String model;
    int year;
    String color;

    // Constructor 1: no parameters
    public Car() {
        this("Undefined", 0, "Undefined"); // Calls constructor 3
    }

    // Constructor 2: model and year
    public Car(String model, int year) {
        this(model, year, "Undefined"); // Calls constructor 3
    }

    // Constructor 3: model, year, color
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void showInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}

public class ConstructorsThis {
    public static void main(String[] args) {
        Car car1 = new Car();                       // Calls constructor 1 -> this() -> constructor 3
        Car car2 = new Car("Civic", 2020);         // Calls constructor 2 -> this() -> constructor 3
        Car car3 = new Car("Corolla", 2023, "Red");// Calls constructor 3 directly

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
    - The this() keyword allows one constructor to call another.
    - Reduces code duplication and centralizes initialization logic.
    - Always must be the first line inside the constructor calling another constructor.
*/