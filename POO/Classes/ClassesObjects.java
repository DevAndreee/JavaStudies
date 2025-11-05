/*
 Topics covered in this file:
 1. What an object is
 2. How to instantiate an object using "new"
 3. Accessing attributes of an object
 4. Calling methods of an object
 5. Multiple objects from the same class
 6. Objects have independent states
*/

class Car {
    String brand;
    String model;
    int speed;

    void startEngine() {
        System.out.println(brand + " engine started!");
    }

    void accelerate(int increment) {
        speed += increment;
        System.out.println(brand + " accelerated. Current speed: " + speed + " km/h");
    }
}

public class ClassesObjects {
    public static void main(String[] args) {
        // Creating the first object
        Car car1 = new Car();
        car1.brand = "Tesla";
        car1.model = "Model 3";
        car1.startEngine();
        car1.accelerate(30);

        System.out.println("------");

        // Creating a second object
        Car car2 = new Car();
        car2.brand = "Toyota";
        car2.model = "Corolla";
        car2.startEngine();
        car2.accelerate(50);

        System.out.println("------");

        // Demonstrating independent states
        System.out.println(car1.brand + " current speed: " + car1.speed);
        System.out.println(car2.brand + " current speed: " + car2.speed);
    }
}

/*
 Key takeaways:
 - An object is an instance of a class.
 - You can create multiple objects from the same class; each has its own state.
 - Access attributes with object.attribute
 - Call methods with object.method()
 - Modifying one object’s attributes does NOT affect another object.
*/