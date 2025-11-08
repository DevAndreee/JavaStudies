
───────────────────────────────────────────────
📘 TOPIC: Classes and Objects
───────────────────────────────────────────────
Topics covered in this file:
1. What an object is
2. How to instantiate an object using "new"
3. Accessing attributes of an object
4. Calling methods of an object
5. Multiple objects from the same class
6. Objects have independent states
───────────────────────────────────────────────


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


───────────────────────────────────────────────
📖 EXPLANATION
───────────────────────────────────────────────
- An object is an instance of a class.
- Objects are created using the keyword "new".
- You can access attributes using the dot syntax (object.attribute).
- Methods are also accessed using the dot syntax (object.method()).
- Each object created from a class has its own copy of the attributes.
- Changing one object’s state does not affect others created from the same class.

───────────────────────────────────────────────
⚡ QUICK REFERENCE
───────────────────────────────────────────────
Class → A blueprint describing attributes and behaviors.
Object → A real instance created from a class.
Instantiation → Creating an object with "new ClassName()".
Accessing → object.attribute / object.method().
Independent States → Each object stores its own data.

───────────────────────────────────────────────
🚫 COMMON MISTAKES
───────────────────────────────────────────────
✗ Forgetting to instantiate before accessing attributes.
✗ Assuming all objects share the same attribute values.
✗ Forgetting that "speed" or other attributes reset to default (0/null) for each new object.

───────────────────────────────────────────────
🔍 LEARN MORE
───────────────────────────────────────────────
- Oracle Docs: https://docs.oracle.com/javase/tutorial/java/javaOO/objects.html
───────────────────────────────────────────────
