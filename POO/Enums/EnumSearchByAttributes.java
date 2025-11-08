
package POO.Enums;

======================
CONCEPT INTRODUCTION
======================

Enums can be searched by their attributes, not just by their constant names.
This is useful when you need to find an enum constant based on a specific
attribute value, such as finding a payment type by its code or a status by
its ID.

Since valueOf() only works with the exact constant name, searching by attributes
requires implementing custom search methods. These methods typically iterate
through all enum constants and return the one that matches the search criteria.

Common patterns:
- Static method that searches by attribute value
- Optional return type to handle cases where no match is found
- Throwing exceptions when a match is required but not found

Syntax:
public static EnumName findByAttribute(Type value) {
    for (EnumName constant : values()) {
        if (constant.getAttribute().equals(value)) {
            return constant;
        }
    }
    return null; // or throw exception
}

public class EnumSearchByAttributes {
    
    enum PaymentType {
        CREDIT_CARD(1, "CC"),
        DEBIT_CARD(2, "DC"),
        CASH(3, "CA"),
        PIX(4, "PX"),
        BANK_TRANSFER(5, "BT");

        private final int code;
        private final String abbreviation;

        PaymentType(int code, String abbreviation) {
            this.code = code;
            this.abbreviation = abbreviation;
        }

        public int getCode() {
            return code;
        }

        public String getAbbreviation() {
            return abbreviation;
        }

        public static PaymentType findByCode(int code) {
            for (PaymentType type : values()) {
                if (type.getCode() == code) {
                    return type;
                }
            }
            return null;
        }

        public static PaymentType findByAbbreviation(String abbreviation) {
            for (PaymentType type : values()) {
                if (type.getAbbreviation().equalsIgnoreCase(abbreviation)) {
                    return type;
                }
            }
            throw new IllegalArgumentException("No payment type with abbreviation: " + abbreviation);
        }
    }

    enum HttpStatus {
        OK(200, "Success"),
        CREATED(201, "Resource created"),
        BAD_REQUEST(400, "Invalid request"),
        NOT_FOUND(404, "Resource not found"),
        INTERNAL_ERROR(500, "Server error");

        private final int statusCode;
        private final String message;

        HttpStatus(int statusCode, String message) {
            this.statusCode = statusCode;
            this.message = message;
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getMessage() {
            return message;
        }

        public static HttpStatus findByStatusCode(int code) {
            for (HttpStatus status : values()) {
                if (status.getStatusCode() == code) {
                    return status;
                }
            }
            return null;
        }

        public static boolean isClientError(int code) {
            HttpStatus status = findByStatusCode(code);
            return status != null && code >= 400 && code < 500;
        }

        public static boolean isServerError(int code) {
            HttpStatus status = findByStatusCode(code);
            return status != null && code >= 500 && code < 600;
        }
    }

    enum Country {
        BRAZIL("BR", "Brazil", 55),
        UNITED_STATES("US", "United States", 1),
        PORTUGAL("PT", "Portugal", 351),
        JAPAN("JP", "Japan", 81);

        private final String code;
        private final String name;
        private final int phonePrefix;

        Country(String code, String name, int phonePrefix) {
            this.code = code;
            this.name = name;
            this.phonePrefix = phonePrefix;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        public int getPhonePrefix() {
            return phonePrefix;
        }

        public static Country findByCode(String code) {
            if (code == null) return null;
            for (Country country : values()) {
                if (country.getCode().equalsIgnoreCase(code)) {
                    return country;
                }
            }
            return null;
        }

        public static Country findByPhonePrefix(int prefix) {
            for (Country country : values()) {
                if (country.getPhonePrefix() == prefix) {
                    return country;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        
        PaymentType payment1 = PaymentType.findByCode(4);
        System.out.println("Payment by code 4: " + payment1);

        PaymentType payment2 = PaymentType.findByAbbreviation("CC");
        System.out.println("Payment by abbreviation CC: " + payment2);

        PaymentType payment3 = PaymentType.findByCode(99);
        System.out.println("Payment by code 99: " + payment3);

        System.out.println();

        HttpStatus status1 = HttpStatus.findByStatusCode(404);
        System.out.println("Status 404: " + status1 + " - " + status1.getMessage());

        System.out.println("Is 404 client error? " + HttpStatus.isClientError(404));
        System.out.println("Is 500 server error? " + HttpStatus.isServerError(500));

        System.out.println();

        Country country1 = Country.findByCode("BR");
        System.out.println("Country BR: " + country1.getName());

        Country country2 = Country.findByPhonePrefix(1);
        System.out.println("Country with prefix 1: " + country2.getName());

        Country country3 = Country.findByCode("XYZ");
        System.out.println("Country XYZ: " + country3);
    }
}

======================
EXPLANATION
======================

EXPLANATION:
- Searching enums by attributes requires custom static methods that iterate through constants
- The values() method returns an array of all enum constants, enabling iteration
- Search methods typically use a for loop to compare each constant's attribute with the search value
- Methods can return null when no match is found, or throw exceptions for required matches
- Case-insensitive searches use equalsIgnoreCase() for String comparisons
- Multiple search methods can coexist, each searching by a different attribute
- Helper methods can be built on top of search methods to provide additional functionality
- Null checks in search methods prevent NullPointerException when comparing attributes

The findByCode methods demonstrate the basic pattern: iterate through all constants
using values(), check if the attribute matches the search value, and return the
constant when found. If the loop completes without finding a match, return null
or throw an exception depending on the use case.

The PaymentType enum shows two approaches to handling not-found cases. The findByCode
method returns null, allowing the caller to handle the absence gracefully. The
findByAbbreviation method throws an IllegalArgumentException, which is appropriate
when the abbreviation should always be valid and an invalid one indicates a bug.

The HttpStatus enum demonstrates building helper methods on top of search functionality.
The isClientError and isServerError methods use findByStatusCode internally and add
additional logic to categorize status codes. This shows how search methods can be
building blocks for more complex operations.

Search methods should handle edge cases like null inputs. The Country.findByCode method
explicitly checks if the code parameter is null before iterating, preventing exceptions
and returning null to indicate no country was found.

Expected Output:
Payment by code 4: PIX
Payment by abbreviation CC: CREDIT_CARD
Payment by code 99: null

Status 404: NOT_FOUND - Resource not found
Is 404 client error? true
Is 500 server error? true

Country BR: Brazil
Country with prefix 1: United States
Country XYZ: null

QUICK REFERENCE:
EnumName.values()                    → get array of all enum constants
for (EnumName e : values())         → iterate through all constants
findByAttribute(value)              → custom search method pattern
return null                         → when match not found (graceful handling)
throw new IllegalArgumentException  → when match is required
equalsIgnoreCase()                  → case-insensitive string comparison

COMMON MISTAKES:
- Forgetting to check for null in search methods (can cause NullPointerException)
- Using == instead of equals() for String comparison (checks reference, not value)
- Not handling the case when no match is found (returning null without documentation)
- Making search methods non-static (they should be accessible without an instance)
- Not validating input parameters before searching (can lead to unexpected behavior)
- Inefficient searches when called frequently (consider caching results in a Map for large enums)

LEARN MORE:
https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
(Section: Enum Types)
https://docs.oracle.com/javase/8/docs/api/java/lang/Enum.html#valueOf-java.lang.Class-java.lang.String-
(Section: Enum API - valueOf method)
```