
package POO.Enums;

======================
CONCEPT INTRODUCTION
======================

Enums can override methods to provide specific behavior for each constant.
This is done using constant-specific method implementations, where each
enum constant can have its own version of a method.

This feature allows each enum constant to behave differently while maintaining
a common interface. It is particularly useful when different constants need
to perform the same operation in different ways.

Two approaches:
1. Override methods in individual constants using anonymous classes
2. Declare abstract methods that force each constant to provide implementation

Syntax:
enum EnumName {
    CONSTANT1 {
        @Override
        public ReturnType method() { }
    },
    CONSTANT2 {
        @Override
        public ReturnType method() { }
    };
    
    public abstract ReturnType method();
}

public class EnumMethodOverride {
    
    enum Operation {
        PLUS {
            @Override
            public double apply(double x, double y) {
                return x + y;
            }
        },
        MINUS {
            @Override
            public double apply(double x, double y) {
                return x - y;
            }
        },
        MULTIPLY {
            @Override
            public double apply(double x, double y) {
                return x * y;
            }
        },
        DIVIDE {
            @Override
            public double apply(double x, double y) {
                return x / y;
            }
        };

        public abstract double apply(double x, double y);
    }

    enum DiscountStrategy {
        NONE {
            @Override
            public double calculate(double price) {
                return price;
            }
            
            @Override
            public String getDescription() {
                return "No discount applied";
            }
        },
        PERCENTAGE_10 {
            @Override
            public double calculate(double price) {
                return price * 0.90;
            }
            
            @Override
            public String getDescription() {
                return "10% discount applied";
            }
        },
        FIXED_AMOUNT {
            @Override
            public double calculate(double price) {
                return price - 20.0;
            }
            
            @Override
            public String getDescription() {
                return "Fixed $20 discount applied";
            }
        },
        BLACK_FRIDAY {
            @Override
            public double calculate(double price) {
                return price * 0.50;
            }
            
            @Override
            public String getDescription() {
                return "Black Friday: 50% off!";
            }
        };

        public abstract double calculate(double price);
        public abstract String getDescription();
    }

    enum HttpStatus {
        OK(200) {
            @Override
            public String getMessage() {
                return "Request successful";
            }
        },
        NOT_FOUND(404) {
            @Override
            public String getMessage() {
                return "Resource not found";
            }
        },
        INTERNAL_ERROR(500) {
            @Override
            public String getMessage() {
                return "Internal server error";
            }
        };

        private final int code;

        HttpStatus(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }

        public abstract String getMessage();
    }

    public static void main(String[] args) {
        
        double a = 10.0;
        double b = 5.0;
        
        for (Operation op : Operation.values()) {
            System.out.println(a + " " + op + " " + b + " = " + op.apply(a, b));
        }

        System.out.println();

        double originalPrice = 100.0;
        for (DiscountStrategy strategy : DiscountStrategy.values()) {
            double finalPrice = strategy.calculate(originalPrice);
            System.out.println(strategy + ": $" + originalPrice + " -> $" + finalPrice);
            System.out.println("  " + strategy.getDescription());
        }

        System.out.println();

        for (HttpStatus status : HttpStatus.values()) {
            System.out.println(status.getCode() + " " + status + ": " + status.getMessage());
        }
    }
}

======================
EXPLANATION
======================

EXPLANATION:
- Enum constants can override methods to provide custom implementations for each constant
- This is achieved using anonymous class syntax where each constant has its own method body
- When a method is declared abstract in the enum, every constant MUST provide an implementation
- Each constant essentially becomes an anonymous subclass of the enum type
- This pattern is known as constant-specific method implementation
- It follows the strategy pattern, where each constant represents a different strategy or behavior
- Methods can be combined with attributes to create rich, behavior-driven enum constants
- Abstract methods in enums enforce that all constants implement the required behavior

The Operation enum demonstrates the classic calculator pattern where each operation
(PLUS, MINUS, MULTIPLY, DIVIDE) implements the apply method differently. This eliminates
the need for switch statements to determine which operation to perform. Each constant
knows how to execute itself.

The DiscountStrategy enum shows how constants can override multiple methods simultaneously.
Each strategy has its own calculation logic and description. This makes adding new discount
types as simple as adding a new constant with its implementation, without modifying any
conditional logic elsewhere in the code.

The HttpStatus enum combines attributes (code) with abstract methods (getMessage). Each
HTTP status code has a numeric code stored as an attribute and a custom message implementation.
This demonstrates that overridden methods can work alongside constructor parameters and
regular attributes.

When you call op.apply(a, b), Java automatically invokes the specific implementation for
that constant. If op is PLUS, it runs the PLUS implementation. There is no need for switch
statements or if-else chains to determine behavior.

Expected Output:
10.0 PLUS 5.0 = 15.0
10.0 MINUS 5.0 = 5.0
10.0 MULTIPLY 5.0 = 50.0
10.0 DIVIDE 5.0 = 2.0

NONE: $100.0 -> $100.0
  No discount applied
PERCENTAGE_10: $100.0 -> $90.0
  10% discount applied
FIXED_AMOUNT: $100.0 -> $80.0
  Fixed $20 discount applied
BLACK_FRIDAY: $100.0 -> $50.0
  Black Friday: 50% off!

200 OK: Request successful
404 NOT_FOUND: Resource not found
500 INTERNAL_ERROR: Internal server error

QUICK REFERENCE:
public abstract ReturnType method()  → declare abstract method in enum
CONSTANT { @Override method() { } }  → override method for specific constant
constant.method()                    → calls the specific constant's implementation
Multiple overrides                   → each constant can override multiple methods
Combines with attributes             → overridden methods can use enum attributes

COMMON MISTAKES:
- Forgetting to implement abstract methods in all constants (compilation error)
- Not using @Override annotation when overriding (missing compile-time checking)
- Forgetting semicolon after last constant when using method overrides
- Trying to override final methods (cannot be overridden)
- Making logic too complex inside constant implementations (keep it simple and focused)
- Not declaring the base method as abstract when all constants should implement it

LEARN MORE:
https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
(Section: Enum Types - Constant-specific Method Implementations)