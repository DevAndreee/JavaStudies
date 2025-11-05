
The 'super' keyword is used in inheritance to access members (attributes, methods, 
and constructors) of the superclass from within a subclass.

It allows you to:
- Call the superclass constructor;
- Access methods and attributes that were overridden or shadowed.


class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void showInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

// Subclass that extends Vehicle
class Car extends Vehicle {
    private String model;

    // Using 'super()' to call the constructor of Vehicle
    public Car(String brand, int year, String model) {
        super(brand, year); // Calls Vehicle(String, int)
        this.model = model;
    }

    // Overriding the showInfo() method
    @Override
    public void showInfo() {
        // Call the superclass version of the method using 'super'
        super.showInfo();
        System.out.println("Model: " + model);
    }

    // Using 'super' to refer to superclass fields (not required here, but possible)
    public void displayBrand() {
        System.out.println("This car’s brand (from superclass): " + super.brand);
    }
}

public class InheritanceSuper {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Toyota", 2015);
        v1.showInfo();

        System.out.println("-----------------");

        Car c1 = new Car("Honda", 2022, "Civic");
        c1.showInfo();       // Calls overridden version
        c1.displayBrand();   // Access superclass field
    }
}


===== EXPLANATION =====

1. 'super' → refers to the direct superclass.
   - super() → calls the constructor of the superclass.
   - super.method() → calls a method from the superclass.
   - super.attribute → accesses an attribute from the superclass.

2. When a subclass constructor is called:
   - The first action must be calling the superclass constructor (explicitly or implicitly).
   - If not explicitly called, Java automatically calls the no-argument constructor of the superclass.

3. You can use 'super' to:
   ✅ Access superclass constructors;
   ✅ Reuse logic from parent methods;
   ✅ Clarify access when subclass fields/methods shadow superclass ones.

4. Important: 'super' is only available inside subclass methods or constructors.

Learn more:
🔗 https://docs.oracle.com/javase/tutorial/java/IandI/super.html
(Section: "Using the Keyword super")