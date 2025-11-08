
 * CONCEPT INTRODUCTION
 * Multidimensional arrays are arrays that store other arrays as elements.
 * They can represent tables, grids, or matrices.
 * Initialization can be done directly with values or step by step (useful for irregular arrays).


public class MultiArrayInit {
    public static void main(String[] args) {

        // Direct initialization with values
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Step-by-step initialization
        int[][] matrix2 = new int[2][3];
        matrix2[0][0] = 10;
        matrix2[1][2] = 30;

        // Irregular array (rows with different lengths)
        int[][] irregular = new int[2][];
        irregular[0] = new int[] {7, 8};
        irregular[1] = new int[] {9};

        // Default values (int → 0)
        System.out.println("Default value at matrix2[0][1]: " + matrix2[0][1]);
    }
}


 * EXPLANATION
 * - matrix1 is a regular array (same number of columns per row).
 * - matrix2 is manually initialized step by step.
 * - irregular demonstrates how each row can have a different size.
 * - Default values depend on the data type (int arrays start with 0).
 *
 * QUICK REFERENCE
 * int[][] matrix = new int[rows][columns];
 * int[][] matrix = { {1,2,3}, {4,5,6} };
 * int[][] irregular = new int[2][];
 * irregular[0] = new int[]{1,2};
 * irregular[1] = new int[]{3};
 *
 * COMMON MISTAKES
 * - Forgetting to initialize inner arrays when creating irregular arrays.
 * - Accessing matrix[i][j] before defining both dimensions.
 *
 * LEARN MORE
 * - Oracle Java Docs: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 