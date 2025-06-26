public class Car {
    String model;
    int year;
    String color;
}

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Gol";
        car1.year = 2020;
        car1.color = "Black";

        Car car2 = new Car();
        car2.model = "Civic";
        car2.year = 2023;
        car2.color = "White";

        System.out.println("Model: " + car1.model + ", Year: " + car1.year + ", Color: " + car1.color);
        System.out.println("Model: " + car2.model + ", Year: " + car2.year + ", Color: " + car2.color);
    }
}

/*
OBJECTS IN JAVA:
 An object is an instance of a class.
 Each object has its own copy of the class attributes.
 Objects are created using the 'new' keyword.
 You can create multiple objects from the same class.
 Attributes are accessed using dot notation: objectName.attribute.
*/