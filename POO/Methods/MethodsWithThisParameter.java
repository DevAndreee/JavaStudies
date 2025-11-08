
package POO.Methods;

======================
CONCEPT INTRODUCTION
======================

In Java, 'this' is a reference to the current object instance.
It allows methods inside the class to access or modify the object's
attributes and call other methods of the same object.

The 'this' keyword is essential when you need to distinguish between
instance variables and parameters with the same name, or when you need
to pass the current object as an argument to another method.

Main uses:
- Differentiate between class attributes and method parameters
- Call another method of the same class
- Pass the current object as an argument to another method or class
- Call another constructor in the same class (constructor chaining)

Syntax:
this.attributeName
this.methodName()
this(arguments)

public class MethodsWithThisParameter {
    
    String model;
    int year;

    public MethodsWithThisParameter(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void printDetails() {
        System.out.println("Model: " + this.model + " | Year: " + this.year);
    }

    public void updateYear(int year) {
        this.year = year;
    }

    public void copyCar(MethodsWithThisParameter otherCar) {
        otherCar.model = this.model;
        otherCar.year = this.year;
    }

    public MethodsWithThisParameter getThis() {
        return this;
    }

    public static void main(String[] args) {
        MethodsWithThisParameter car1 = new MethodsWithThisParameter("Honda", 2020);
        MethodsWithThisParameter car2 = new MethodsWithThisParameter("Toyota", 2018);

        System.out.println("Initial state:");
        car1.printDetails();
        car2.printDetails();

        System.out.println("\nAfter updating car1 year:");
        car1.updateYear(2022);
        car1.printDetails();

        System.out.println("\nAfter copying car1 to car2:");
        car1.copyCar(car2);
        car2.printDetails();

        System.out.println("\nDemonstrating this reference:");
        MethodsWithThisParameter sameAsCar1 = car1.getThis();
        System.out.println("car1 and returned object are same: " + (car1 == sameAsCar1));
    }
}

======================
EXPLANATION
======================

EXPLANATION:
- The 'this' keyword is an implicit reference that exists in every instance method
- It always refers to the object on which the current method was called
- When you write this.model, you explicitly refer to the instance variable, not a local variable or parameter
- This is particularly important in constructors and setters where parameter names often match field names
- Using 'this' makes code more readable by clearly indicating when you are working with instance members
- You can pass 'this' as an argument to other methods, effectively passing the current object
- The 'this' reference is automatically available in all non-static methods but cannot be used in static contexts
- Each object has its own 'this' reference pointing to itself

In the constructor MethodsWithThisParameter(String model, int year), without 'this',
the line model = model would just assign the parameter to itself, not to the instance variable.
The 'this.model' explicitly tells Java you want the instance variable, not the parameter.

When you call car1.copyCar(car2), inside the copyCar method, 'this' refers to car1
(the object on which copyCar was called), and otherCar refers to car2 (the parameter).
So this.model is car1's model, and otherCar.model is car2's model.

Expected Output:
Initial state:
Model: Honda | Year: 2020
Model: Toyota | Year: 2018

After updating car1 year:
Model: Honda | Year: 2022

After copying car1 to car2:
Model: Honda | Year: 2022

Demonstrating this reference:
car1 and returned object are same: true

QUICK REFERENCE:
this.attribute          → access instance variable
this.method()          → call instance method
this(args)             → call another constructor (must be first line)
return this            → return current object reference
method(this)           → pass current object as parameter

COMMON MISTAKES:
- Trying to use 'this' in static methods or static contexts (compilation error - no instance exists)
- Forgetting 'this' when parameter names match field names (parameters shadow fields)
- Confusing 'this' with the class name (this refers to instance, class name refers to type)
- Using this() constructor call not as the first statement (compilation error)
- Assuming 'this' is needed everywhere (it's optional when no ambiguity exists)

LEARN MORE:
https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html
(Section: Using the this Keyword)
```