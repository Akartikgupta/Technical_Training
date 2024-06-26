// https://leetcode.com/problems/transpose-matrix/
public class Transpose_Matrix {
    public static int[][] transpose(int[][] matrix) {
        int arr[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int ans[][] = transpose(matrix);
        for (int i[] : ans) {
            for (int val : i) {
                System.out.print(val);
            }
            System.out.println();
        }
    }
}
