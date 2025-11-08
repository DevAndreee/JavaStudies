    CONCEPT INTRODUCTION:
    Multidimensional arrays in Java are arrays that contain other arrays.
    They are commonly used to represent tables, grids, or matrices (rows and columns).
    Each "row" in the array is itself an array, meaning the structure can be regular (same row size) or irregular (different lengths per row).

public class MultiArrayIntro {
    public static void main(String[] args) {

        // Regular multidimensional array: 2 rows, 3 columns
        int[][] table = new int[2][3];

        // Irregular array: each row can have a different size
        int[][] irregular = new int[2][];
        irregular[0] = new int[3]; // row 0 has 3 elements
        irregular[1] = new int[1]; // row 1 has 1 element
    }

    
    EXPLANATION:
    - A multidimensional array is an array of arrays.
    - It is declared using multiple brackets: int[][].
    - Regular arrays have equal row sizes; irregular ones do not.
    - Commonly used in matrix operations, games, or data grids.

    QUICK REFERENCE:
    Syntax:
      int[][] matrix = new int[rows][columns];
      int[][] irregular = new int[rows][];
      irregular[0] = new int[lengthOfRow0];

    COMMON MISTAKES:
    - Forgetting to initialize inner arrays in irregular structures.
    - Confusing the number of rows (matrix.length) with the number of columns (matrix[row].length).

    LEARN MORE:
    🔗 Java Documentation – Multidimensional Arrays:
      https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
    
}