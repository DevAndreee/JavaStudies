public class MultiArrayLoop {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Traditional for loop with index
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        // Foreach loop (simpler, no index access)
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
        }
    }
}

/*
LOOPING MULTIDIMENSIONAL ARRAYS:
  Traditional for gives control over indices.
  Foreach is simpler, great for just reading values.
  Both loops traverse row by row, column by column.
*/