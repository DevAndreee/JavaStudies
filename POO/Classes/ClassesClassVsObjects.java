/*
 Topics covered in this file:
 1. Difference between a class and an object
 2. Class = blueprint / Object = instance
 3. Attributes and methods belong to the class definition
 4. Objects store actual values (state)
 5. Multiple objects from the same class can exist independently
*/

class Car {
    String brand;
    int speed;

    void startEngine() {
        System.out.println(brand + " engine started!");
    }

    void accelerate(int increment) {
        speed += increment;
        System.out.println(brand + " accelerated. Current speed: " + speed + " km/h");
    }
}

public class ClassesClassVsObjects {
    public static void main(String[] args) {
        // Class is just a blueprint:
        // Car blueprint exists, but no real car yet

        // Object = instance of the class
        Car car1 = new Car(); // creating an object
        car1.brand = "Tesla";
        car1.speed = 0;
        car1.startEngine();
        car1.accelerate(50);

        Car car2 = new Car(); // another object, independent
        car2.brand = "Ferrari";
        car2.speed = 0;
        car2.startEngine();
        car2.accelerate(100);

        System.out.println("------");

        System.out.println("car1 brand: " + car1.brand + " | speed: " + car1.speed);
        System.out.println("car2 brand: " + car2.brand + " | speed: " + car2.speed);
    }
}

/*
 Key takeaways:
 - Class = abstract concept / blueprint of objects
 - Object = concrete instance with its own data
 - Methods define behaviors, attributes store state
 - Multiple objects from the same class share the structure, but not the data
 - Understanding this difference is essential for OOP foundations
*/