
package POO.Enums;

======================
CONCEPT INTRODUCTION
======================

Enums can have attributes (fields) and constructors just like regular classes.
This allows each enum constant to carry additional data and behavior, making
enums much more powerful than simple lists of constants.

Enum constructors are always private (implicitly or explicitly) because enum
constants are the only instances that should exist. The constructor is called
automatically for each constant when the enum is first loaded.

Key characteristics:
- Enum attributes are typically declared as private final for immutability
- Each constant calls the constructor with specific values
- Constructors cannot be public or protected
- Multiple attributes and multiple constructors are allowed
- Getters provide access to private attributes

Syntax:
enum EnumName {
    CONSTANT1(value1), CONSTANT2(value2);
    
    private final Type attribute;
    
    EnumName(Type attribute) {
        this.attribute = attribute;
    }
    
    public Type getAttribute() {
        return attribute;
    }
}

public class EnumConstructorsAttributes {
    
    enum CustomerType {
        REGULAR(0.0, "Standard customer"),
        SILVER(0.05, "Silver member with 5% discount"),
        GOLD(0.10, "Gold member with 10% discount"),
        PLATINUM(0.15, "Platinum member with 15% discount");

        private final double discount;
        private final String description;

        CustomerType(double discount, String description) {
            this.discount = discount;
            this.description = description;
        }

        public double getDiscount() {
            return discount;
        }

        public String getDescription() {
            return description;
        }

        public double applyDiscount(double price) {
            return price - (price * discount);
        }
    }

    enum PaymentMethod {
        CREDIT_CARD("Credit Card", 2.5),
        DEBIT_CARD("Debit Card", 1.5),
        CASH("Cash", 0.0),
        PIX("PIX", 0.0),
        BANK_TRANSFER("Bank Transfer", 1.0);

        private final String displayName;
        private final double transactionFee;

        PaymentMethod(String displayName, double transactionFee) {
            this.displayName = displayName;
            this.transactionFee = transactionFee;
        }

        public String getDisplayName() {
            return displayName;
        }

        public double getTransactionFee() {
            return transactionFee;
        }

        public double calculateTotal(double amount) {
            return amount + (amount * transactionFee / 100);
        }
    }

    enum Planet {
        MERCURY(3.303e23, 2.4397e6),
        VENUS(4.869e24, 6.0518e6),
        EARTH(5.976e24, 6.37814e6),
        MARS(6.421e23, 3.3972e6);

        private final double mass;
        private final double radius;

        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
        }

        public double getMass() {
            return mass;
        }

        public double getRadius() {
            return radius;
        }

        public double surfaceGravity() {
            double G = 6.67300E-11;
            return G * mass / (radius * radius);
        }
    }

    public static void main(String[] args) {
        
        System.out.println("=== Customer Type Example ===");
        CustomerType customer = CustomerType.GOLD;
        System.out.println("Customer type: " + customer);
        System.out.println("Description: " + customer.getDescription());
        System.out.println("Discount: " + (customer.getDiscount() * 100) + "%");
        
        double originalPrice = 100.0;
        double finalPrice = customer.applyDiscount(originalPrice);
        System.out.println("Original price: $" + originalPrice);
        System.out.println("Final price: $" + finalPrice);

        System.out.println("\n=== Payment Method Example ===");
        PaymentMethod payment = PaymentMethod.CREDIT_CARD;
        System.out.println("Payment method: " + payment.getDisplayName());
        System.out.println("Transaction fee: " + payment.getTransactionFee() + "%");
        
        double purchaseAmount = 50.0;
        double totalWithFee = payment.calculateTotal(purchaseAmount);
        System.out.println("Purchase amount: $" + purchaseAmount);
        System.out.println("Total with fee: $" + totalWithFee);

        System.out.println("\n=== All Payment Methods ===");
        for (PaymentMethod method : PaymentMethod.values()) {
            System.out.println(method.getDisplayName() + " - Fee: " + method.getTransactionFee() + "%");
        }

        System.out.println("\n=== Planet Example ===");
        Planet earth = Planet.EARTH;
        System.out.println("Planet: " + earth);
        System.out.println("Mass: " + earth.getMass() + " kg");
        System.out.println("Radius: " + earth.getRadius() + " m");
        System.out.println("Surface gravity: " + earth.surfaceGravity() + " m/s²");

        System.out.println("\n=== All Planets Surface Gravity ===");
        for (Planet planet : Planet.values()) {
            System.out.printf("%s: %.2f m/s²%n", planet, planet.surfaceGravity());
        }
    }
}

======================
EXPLANATION
======================

EXPLANATION:
- Enum constructors are called exactly once per constant when the enum class is first loaded
- The constructor must be private or package-private, never public or protected
- Multiple attributes of different types can be declared in a single enum
- Each enum constant calls the constructor with its specific values in parentheses
- Attributes should be declared as private final to ensure immutability and encapsulation
- Getter methods provide controlled access to private attributes
- Enums can have methods that use their attributes to perform calculations or logic
- The order of declaration matters: constants first, then attributes, then constructor, then methods

When you declare CustomerType.GOLD(0.10, "Gold member with 10% discount"), Java automatically
calls the constructor CustomerType(double discount, String description) with those values.
This happens during class loading, before any code can use the enum constants.

Enum attributes are typically final because enum constants should be immutable. Once created,
the discount value for GOLD should never change. This immutability makes enums thread-safe
and predictable, which is essential for constants.

Methods in enums can use the enum's attributes to provide useful functionality. The applyDiscount
method uses the discount attribute to calculate a discounted price, while surfaceGravity uses
mass and radius to compute gravitational acceleration. This makes enums more than just constants
they become objects with both data and behavior.

Expected Output:
=== Customer Type Example ===
Customer type: GOLD
Description: Gold member with 10% discount
Discount: 10.0%
Original price: $100.0
Final price: $90.0

=== Payment Method Example ===
Payment method: Credit Card
Transaction fee: 2.5%
Purchase amount: $50.0
Total with fee: $51.25

=== All Payment Methods ===
Credit Card - Fee: 2.5%
Debit Card - Fee: 1.5%
Cash - Fee: 0.0%
PIX - Fee: 0.0%
Bank Transfer - Fee: 1.0%

=== Planet Example ===
Planet: EARTH
Mass: 5.976E24 kg
Radius: 6378140.0 m
Surface gravity: 9.80 m/s²

=== All Planets Surface Gravity ===
MERCURY: 3.70 m/s²
VENUS: 8.87 m/s²
EARTH: 9.80 m/s²
MARS: 3.71 m/s²

QUICK REFERENCE:
CONSTANT(value1, value2)     → calling constructor with arguments
private final Type attr      → declaring immutable enum attribute
EnumName(Type param)        → enum constructor (always private)
public Type getAttr()       → getter method for attribute access
constant.getAttr()          → accessing attribute via getter
constant.method()           → calling enum instance method

COMMON MISTAKES:
- Making enum constructor public or protected (must be private or package-private)
- Not making attributes final (breaks immutability and thread-safety)
- Forgetting semicolon after last constant when adding attributes and methods
- Declaring attributes after constructor (order: constants, attributes, constructor, methods)
- Not providing getter methods for private attributes (no way to access the data)
- Trying to modify enum attributes after creation (should be immutable)

LEARN MORE:
https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
(Section: Enum Types - Constructor and Methods)
```