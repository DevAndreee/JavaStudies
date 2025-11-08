
 * CONCEPT INTRODUCTION
 * Looping through multidimensional arrays can be done using traditional "for" loops
 * (which give control over row and column indices) or with enhanced "foreach" loops
 * (which simplify traversal when index access isn't needed).
 

public class MultiArrayLoop {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Traditional for loop — gives control over indices
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        System.out.println(); // Line break between outputs

        // Foreach loop — simpler, no index access
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
        }
    }
}


 * EXPLANATION
 * - Traditional "for" loops allow full control of indices (useful for modifying elements).
 * - "Foreach" loops are concise and ideal for reading data only.
 * - Both methods iterate over rows and columns sequentially.
 *
 * QUICK REFERENCE
 * // Traditional for:
 * for (int i = 0; i < matrix.length; i++) {
 *     for (int j = 0; j < matrix[i].length; j++) {
 *         System.out.println(matrix[i][j]);
 *     }
 * }
 *
 * // Enhanced for:
 * for (int[] row : matrix) {
 *     for (int value : row) {
 *         System.out.println(value);
 *     }
 * }
 *
 * COMMON MISTAKES
 * - Forgetting that "foreach" cannot modify the original elements directly.
 * - Confusing row and column indexes when using nested "for" loops.
 *
 * LEARN MORE
 * - Oracle Java Docs: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
 