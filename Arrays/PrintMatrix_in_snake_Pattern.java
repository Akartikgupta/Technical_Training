import java.util.ArrayList;
import java.util.List;

// https://www.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1
public class PrintMatrix_in_snake_Pattern {
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < matrix.length; col++) {
                    list.add(matrix[row][col]);
                }
            } else {
                int left = 0;
                int right = matrix.length - 1;
                while (left <= right) {
                    int temp = matrix[row][left];
                    matrix[row][left] = matrix[row][right];
                    matrix[row][right] = temp;
                    left++;
                    right--;
                }
                for (int cols = 0; cols < matrix.length; cols++) {
                    list.add(matrix[row][cols]);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 45, 48, 54 }, { 21, 89, 87 }, { 70, 78, 15 } };
        System.out.println(snakePattern(matrix));
    }
}
