/*
    Constructors Default

    Key points:
    - If you do NOT declare any constructor, Java automatically provides a default constructor.
    - This default constructor has no parameters and initializes the object with default values.
    - If you declare any constructor (with or without parameters), the default constructor is NOT created automatically.
    - Understanding this helps avoid compilation errors when trying to create objects with no-argument constructors.
*/

class Car {
    String model;
    int year;

    // Uncomment the next constructor to see the effect on the default constructor
    /*
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    */
}

public class ConstructorsDefault {
    public static void main(String[] args) {
        // Since no constructor is declared, Java provides a default constructor
        Car car1 = new Car();

        System.out.println("Model: " + car1.model + ", Year: " + car1.year);
        // Output will be:
        // Model: null, Year: 0
        // Default values for object attributes
    }
}

/*
    Explanation:
    - car1 is created using the default constructor automatically provided by Java.
    - model is initialized to null (default for String) and year to 0 (default for int).
    - If we uncomment the manual constructor, the default no-argument constructor disappears,
      and trying to do "new Car()" without arguments would cause a compilation error.
*/