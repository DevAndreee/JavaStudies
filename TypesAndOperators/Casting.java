

Casts are used to convert data types in Java — either automatically (widening) or manually (narrowing).  
Widening happens from smaller to larger types (safe and implicit), while narrowing requires explicit syntax and can lose data.  


public class Casting {
    public static void main (String[] args){
        
        // Widening (automatic)
        byte numByte = 42;
        int numInt = numByte;
        double numDouble = numInt;
        
        // Narrowing (manual)
        double originalDouble = 9.99;
        int convertedInt = (int) originalDouble;
        
        int asciiCode = 66;
        char charFromInt = (char) asciiCode;
        
        float numFloat = 5.75f;
        short convertedShort = (short) numFloat;
    }
}


EXPLANATION:
- Widening Casting → automatic conversion from smaller to larger data types.
  (byte → short → int → long → float → double)
  No explicit cast is needed, and there’s no data loss.

- Narrowing Casting → manual conversion from larger to smaller data types.
  (double → float → long → int → short → byte)
  Requires an explicit cast (type), and can cause truncation or precision loss.

Example behavior:
- byte → int: automatic
- int → double: automatic, adds .0
- double → int: manual, decimals lost (9.99 → 9)
- int → char: manual, converts number to ASCII ('B' = 66)
- float → short: manual, may truncate value

QUICK REFERENCE:
Syntax:
  // Widening
  int myInt = 10;
  double myDouble = myInt;    // automatic
  // Narrowing
  double value = 9.8;
  int casted = (int) value;   // manual

COMMON MISTAKES:
- Forgetting explicit cast during narrowing → compilation error.
- Assuming no data loss in narrowing → may truncate or overflow.
- Casting incompatible types (e.g., boolean to int) → not allowed.

LEARN MORE:
- Java Documentation: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
- Oracle Casting Guide: https://docs.oracle.com/javase/specs/