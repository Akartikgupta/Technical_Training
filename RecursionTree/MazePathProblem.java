public class MazePathProblem {
    static void mazeOption(int row, int col, int rowEnd, int colEnd, String result) {
        // base cases
        if (row == rowEnd && col == colEnd) {
            System.out.println(result);
            return;
        }
        if (row > rowEnd || col > colEnd) {
            return;
        }
        // move to the right
        mazeOption(row, col + 1, rowEnd, colEnd, result + "H");
        // move to the down
        mazeOption(row + 1, col, rowEnd, colEnd, result + "V");
    }

    public static void main(String[] args) {
        mazeOption(0, 0, 2, 2, "");
    }
}
