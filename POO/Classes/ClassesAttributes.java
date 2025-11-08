
C L A S S E S — A T T R I B U T E S

Attributes (also called fields or properties) are variables declared inside a class.
They represent the **state** or **characteristics** of an object.  
Each object created from a class has its own copy of these attributes.

Example analogy:
Imagine a class "Car".
Each real car has its own brand, model, and year — those are the attributes.


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
        // Object 1
        Car car1 = new Car();
        car1.brand = "Tesla";
        car1.model = "Model 3";
        car1.year = 2022;
        car1.isElectric = true;
        car1.showInfo();

        System.out.println("------");

        // Object 2 (different state)
        Car car2 = new Car();
        car2.brand = "Toyota";
        car2.model = "Corolla";
        car2.year = 2018;
        car2.isElectric = false;
        car2.showInfo();

        System.out.println("------");

        // Object 3 (default values)
        Car car3 = new Car();
        car3.showInfo();
    }
}


EXPLANATION:
- Attributes are variables inside a class that describe an object’s data.
- Each object has its **own** attribute values.
- If you don’t assign values, Java automatically provides **default values**.

Default values:
  int, byte, short, long → 0  
  float, double          → 0.0  
  boolean                → false  
  char                   → '\u0000'  
  reference types        → null  

QUICK REFERENCE:
  - Attributes store object data.
  - Declared inside the class, but outside methods.
  - Each object has its own copy.
  - Default values are auto-assigned if none are set.

COMMON MISTAKES:
  - Assuming attributes are shared among all objects (they aren’t).
  - Forgetting that String defaults to "null", not an empty string "".
  - Mixing attribute declaration with local variables (they behave differently).

LEARN MORE:
  - Java Docs: https://docs.oracle.com/javase/tutorial/java/javaOO/fields.html
 
