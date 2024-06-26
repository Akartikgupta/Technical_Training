// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
public class Count_Negative_Numbers_inSorted_Matrix {
    public static int countNegatives(int[][] grid) {
        // Approach 2
        int count = 0;
        int colsLen = grid[0].length;
        for (int row[] : grid) {
            int left = 0;
            int right = grid[0].length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (row[mid] < 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            count = count + (colsLen - left);
        }
        return count;

        // int count = 0;
        // for (int rows[] : grid) {
        // for (int val : rows) {
        // if (val < 0) {
        // count++;
        // }
        // }
        // }
        // return count;
    }

    public static void main(String[] args) {
        int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
        System.out.println(countNegatives(grid));
    }
}
