// Low cohesion: the class handles responsibilities not directly related to a car
public class LowCohesionCar {
    String model;
    int year;
    String color;

    void printInvoice() {
        // unrelated to the car's core responsibility
    }

    void saveToDatabase() {
        // external responsibility
    }

    void sendNotification() {
        // another unrelated responsibility
    }
}

// High cohesion: the class focuses only on car-related data
public class Car {
    String model;
    int year;
    String color;
}

/*
COHESION IN OOP:
 Cohesion refers to how focused and related the responsibilities of a class are.
 A highly cohesive class handles only one well-defined purpose or concept.
 The Car class should contain only attributes and behaviors directly related to a car.
 Adding invoices, database, or notification logic breaks cohesion.
 High cohesion improves understanding, maintenance, and reusability.
*/