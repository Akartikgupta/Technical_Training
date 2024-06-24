// https://leetcode.com/problems/matrix-diagonal-sum/
public class Matrix_Diagonal_Sum {
    public static int diagonalSum(int[][] mat) {
        int preDiagonalSum = 0;
        int secDiagonalSum = 0;
        int sum = 0;
        for (int row = 0; row < mat.length; row++) {
            preDiagonalSum += mat[row][row];
        }
        for (int col = 0; col < mat.length; col++) {
            secDiagonalSum += mat[col][mat.length - col - 1];
        }
        // removing intersecting element
        if (mat.length % 2 != 0) {
            int insersecting = mat[mat.length / 2][mat.length / 2];
            secDiagonalSum -= insersecting;
        }
        sum = preDiagonalSum + secDiagonalSum;
        return sum;
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // diagonalSum(mat);
        System.out.println(diagonalSum(mat));
    }
}
