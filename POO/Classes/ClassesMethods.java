/*
 Classes – Methods

 1. What are methods in a class?
 - Methods are blocks of code inside a class that define the *behavior* of the objects.
 - While attributes describe "what the object is" (its state), 
   methods describe "what the object does" (its actions).

 Analogy:
 - Class: Car
   Attributes: brand, model, year
   Methods: startEngine(), accelerate(), brake()

 2. Syntax:
 class ClassName {
     // attribute
     int year;

     // method
     void methodName() {
         // action to be performed
     }
 }
*/

class Car {
    // Attributes
    String brand;
    int speed;

    // Method without parameters
    void startEngine() {
        System.out.println(brand + " engine started!");
    }

    // Method with parameter
    void accelerate(int increment) {
        speed += increment;
        System.out.println(brand + " accelerated. Current speed: " + speed + " km/h");
    }

    // Method with return
    int getSpeed() {
        return speed;
    }

    // Method using both attribute and parameter
    void setBrand(String newBrand) {
        brand = newBrand;
    }
}

public class ClassesMethods {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Tesla");

        car1.startEngine();
        car1.accelerate(30);
        car1.accelerate(20);

        System.out.println("Final speed of " + car1.brand + ": " + car1.getSpeed() + " km/h");

        System.out.println("------");

        Car car2 = new Car();
        car2.setBrand("Ferrari");
        car2.startEngine();
        car2.accelerate(50);

        System.out.println("Final speed of " + car2.brand + ": " + car2.getSpeed() + " km/h");
    }
}

/*
 3. Key takeaways:
 - Methods = define what an object can do.
 - They can:
   • use attributes (startEngine uses brand),
   • take parameters (accelerate takes increment),
   • return values (getSpeed returns current speed).
 - Methods make objects "alive", not just static data.

 4. Questions to reflect:
 - What happens if you call accelerate() on a car before starting the engine? 
   Should we add validation?
 - What if I never set the brand? What would startEngine() print?
 - Why does getSpeed() return an int instead of void?
 - Can a method return an object instead of a primitive?

 5. Challenge exercise:
 Create a class "BankAccount" with attributes:
 - accountNumber, balance
 And methods:
 - deposit(double amount)
 - withdraw(double amount)
 - getBalance()
 Then create two accounts, deposit and withdraw money, and print the balances.
*/