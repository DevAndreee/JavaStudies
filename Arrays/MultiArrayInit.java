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

        // Irregular array
        int[][] irregular = new int[2][];
        irregular[0] = new int[] {7, 8};
        irregular[1] = new int[] {9};

        // Default values (int -> 0)
        System.out.println("Default value at matrix2[0][1]: " + matrix2[0][1]);
    }
}

/*
MULTIDIMENSIONAL ARRAY INITIALIZATION:
  You can initialize directly with curly braces.
  You can also build it step by step (useful for irregular arrays).
  Default values for int arrays are 0.
  Irregular arrays must be set row by row.
*/