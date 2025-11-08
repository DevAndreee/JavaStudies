
Primitive types are the most basic data types in Java — they store simple values directly in memory (not objects).  
Each type has a specific size, range, and purpose. These are the building blocks of data in Java.


public class PrimitivesTypes {
    public static void main (String[] args){
        
        // Integers
        byte numByte = 127;
        short numShort = 3000;
        int numInt = 10;
        long numLong = 1000000L;
        
        // Characters
        char character = 'A';
        char ascii = 65;
        char unicode = '\u0041';
        
        // Decimals
        float numFloat = 1.0f;
        double numDouble = 1.000;
        
        // Booleans
        boolean trueCase = true;
        boolean falseCase = false;
    }
}

EXPLANATION  
Java’s **8 primitive types** represent simple, low-level data values:  

| Type | Size | Example | Description |
|------|------|----------|-------------|
| byte | 8-bit | `127` | small integer (-128 to 127) |
| short | 16-bit | `3000` | short integer (-32,768 to 32,767) |
| int | 32-bit | `10` | standard integer (most used) |
| long | 64-bit | `1000000L` | large integer, suffix `L` required |
| float | 32-bit | `1.0f` | single-precision decimal, suffix `f` required |
| double | 64-bit | `1.000` | double-precision decimal (default for decimals) |
| char | 16-bit | `'A'` | single Unicode character |
| boolean | 1-bit | `true`, `false` | logical values |

QUICK REFERENCE  
- Default values: `0` for numbers, `false` for boolean, `'\u0000'` for char.  
- Numeric literals default to `int` and `double`.  
- Use suffixes: `L` for long, `f` for float.  
- `char` can hold Unicode or ASCII values.

COMMON MISTAKES  
- Forgetting `L` or `f` suffixes.  
- Assigning a large number to `byte` or `short` (overflow).  
- Using double quotes `"` instead of single `'` for `char`.

LEARN MORE  
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html