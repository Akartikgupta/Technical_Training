public class Rotate_Image {
    public static void rotate(int[][] matrix) {
        // first step to transpose the array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // reverse the matrix
        for (int row[] : matrix) {
            // using the 2 pointer approach to reverse the array
            for (int i = 0, j = matrix.length - 1; i < matrix.length / 2; i++, j--) {
                int temp = row[i];
                row[i] = row[j];
                row[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
