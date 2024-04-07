public class BoardProblem {
    public static void boardProblem(int currentValue, int EndValue, String result) {
        // base case
        if (currentValue == EndValue) {
            System.out.println(result + " , ");
            return;
        }
        // for negative value
        if (currentValue > EndValue) {
            return;
        }
        // small problem
        for (int dice = 1; dice <= 6; dice++) {
            boardProblem(currentValue + dice, EndValue, result + dice);
        }
    }

    public static void main(String[] args) {
        boardProblem(0, 10, "");
    }
}

