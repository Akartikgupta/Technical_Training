public class Set_Matrix_Zeroes {
    public static void setZeroes(int[][] matrix) {
        // approach -2
        boolean row[] = new boolean[matrix.length];
        boolean col[] = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

        // int n = matrix.length;
        // int m = matrix[0].length;
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix.length; j++) {
        // if (matrix[i][j] == 0) {
        // markRow(i, m, matrix);
        // markCol(j, n, matrix);
        // }
        // }
        // }
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix.length; j++) {
        // if (matrix[i][j] == -1) {
        // matrix[i][j] = 0;
        // }
        // }
        // }

    }

    // private static void markCol(int j, int n, int[][] matrix) {
    // for (int i = 0; i < n; i++) {
    // if (matrix[i][j] != 0) {
    // matrix[i][j] = -1;
    // }
    // }
    // }

    // private static void markRow(int i, int m, int[][] matrix) {
    // for (int j = 0; j < m; j++) {
    // if (matrix[i][j] != 0) {
    // matrix[i][j] = -1;
    // }
    // }
    // }

    public static void main(String[] args) {
        int arr[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
