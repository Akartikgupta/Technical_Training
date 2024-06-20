import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/lucky-numbers-in-a-matrix/
public class Lucky_Numbers_in_Matrix {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        // maintain a min element list
        List<Integer> minRow = new ArrayList<>();
        // maintain a max element in list
        List<Integer> maxCol = new ArrayList<>();
        // getting the min in rows
        for (int i = 0; i < matrix.length; i++) {
            int minElement = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                minElement = Math.min(minElement, matrix[i][j]);
            }
            minRow.add(minElement);
        }
        // getting the maximum in cols
        for (int j = 0; j < matrix[0].length; j++) {
            int maxElement = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                maxElement = Math.max(maxElement, matrix[i][j]);
            }
            maxCol.add(maxElement);
        }
        // comparing which element is lucky
        List<Integer> ans = new ArrayList<>();
        for (int val : minRow) {
            if (maxCol.contains(val)) {
                ans.add(val);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
        System.out.println(luckyNumbers(matrix));
    }
}
