
public class Operators {
    public static void main (String[] args){

        // Integers
        int value1 = 10;
        int value2 = 20;
        int sum = value1 + value2; // sum = 30

        // Division
        int numerator = 10;
        double denominator = 20;
        double divisionResult = numerator / denominator; // Result = 0.5

        // Remainder
        double remainder1 = 20 % 2; // 0
        double remainder2 = 20 % 7; // 6

        // Boolean comparisons
        // < >
        boolean greaterThan = 10 > 20; // false
        boolean lessThan = 10 < 20;    // true
        // >= <=
        boolean greaterOrEqual = 20 >= 20; // true
        boolean lessOrEqual = 21 <= 20;    // false
        // == !=
        boolean isEqual = 10 == 10;        // true
        boolean isDifferent = 10 != 11;    // true

        // Logical Operators
        boolean andResult = (10 > 5) && (5 < 10); // true
        boolean orResult = (10 < 5) || (5 < 10);  // true

        // Assignment Operators
        int number = 10;
        number += 5; // number = 15
        number -= 3; // number = 12
        number *= 2; // number = 24
        number /= 4; // number = 6
        number %= 5; // number = 1

        // Increment / Decrement
        int a = 5;
        int preIncrement = ++a; // a becomes 6, preIncrement = 6
        int b = 5;
        int postIncrement = b++; // postIncrement = 5, b becomes 6

        int c = 5;
        int preDecrement = --c; // c becomes 4, preDecrement = 4
        int d = 5;
        int postDecrement = d--; // postDecrement = 5, d becomes 4
        
        
        
    }
}

/*
++a (pre-increment): increments the value first, then uses it in the expression.
a++ (post-increment): uses the value first, then increments it.
Same logic applies to --a and a-- for decrement.
*/