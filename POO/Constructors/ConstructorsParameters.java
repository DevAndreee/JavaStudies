/*
    Constructors with Parameters

    - Constructors can receive parameters, just like methods.
    - This allows you to initialize attributes with custom values when creating an object.
    - It's a common and recommended practice in OOP to avoid having objects with "undefined" states.
*/

class Car {
    String model;
    int year;

    // Constructor with parameters
    Car(String model, int year) {
        this.model = model;   // "this" is used to refer to the current object's attribute
        this.year = year;
    }

    void showInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class ConstructorsParameters {
    public static void main(String[] args) {
        // Creating objects with custom initial values
        Car car1 = new Car("Civic", 2020);
        Car car2 = new Car("Corolla", 2023);

        car1.showInfo();
        car2.showInfo();
    }
}

/*
    Output:
    Model: Civic, Year: 2020
    Model: Corolla, Year: 2023

    Explanation:
    - When creating the object with "new Car("Civic", 2020)", the constructor assigns:
        this.model = "Civic"
        this.year = 2020
    - Each object is independent and has its own attribute values.
*/