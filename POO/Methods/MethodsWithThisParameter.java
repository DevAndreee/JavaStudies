/*
 In Java, **this** is a reference to the current object
 It allows methods inside the class to access or modify the object's attributes
 Main uses:
  - Differentiate between class attributes and method parameters
  - Call another method of the same class
  - Pass the current object as an argument to another method or class
 Advantages:
  - Avoids ambiguity between parameters and attributes
  - Makes it easier to reference the current object
 Common mistakes:
  - Forgetting that this can only be used in non-static methods
  - Trying to use this in a static context (like main)
*/

public class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model; // this references the object's attribute
        this.year = year;
    }

    public void printDetails() {
        System.out.println("Model: " + this.model + " | Year: " + this.year);
    }

    public void updateYear(int year) {
        this.year = year; // updates the object's attribute using this
    }

    public void copyCar(Car otherCar) {
        otherCar.model = this.model; // uses this to pass the current object
        otherCar.year = this.year;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Honda", 2020);
        Car car2 = new Car("Toyota", 2018);

        car1.printDetails(); // Model: Honda | Year: 2020
        car2.printDetails(); // Model: Toyota | Year: 2018

        car1.updateYear(2022);
        car1.printDetails(); // Model: Honda | Year: 2022

        car1.copyCar(car2);
        car2.printDetails(); // Model: Honda |