public class Casting {
    public static void main (String[] args){
        
        // Widening (auto)
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


/*
Widening Casting → automatic conversion from smaller to larger type (e.g., byte → int → double)
Narrowing Casting → manual conversion from larger to smaller type using (type)
byte to int → automatic, no data loss
int to double → automatic, adds decimal part (.0)
double to int → manual, loses decimals ( 99 → 9)
int to char → manual, gives character from ASCII code (e.g., 66 → 'B')
float to short → manual, may lose decimal and truncate
*/