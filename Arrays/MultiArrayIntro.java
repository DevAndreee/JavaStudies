public class MultiArrayIntro {
    public static void main(String[] args) {

        // Multidimensional arrays are arrays of arrays.

        int[][] table = new int[2][3]; // 2 rows, 3 columns

        // Irregular array: rows with different lengths
        int[][] irregular = new int[2][];
        irregular[0] = new int[3]; // row 0 has 3 elements
        irregular[1] = new int[1]; // row 1 has 1 element
    }
}

/*
MULTIDIMENSIONAL ARRAYS:
  Represent table-like structures (rows and columns).
  Syntax example: int[][] matrix = new int[2][3];
  Can be regular (same row size) or irregular.
  Useful for grids, maps, tables, and matrix operations.
*/