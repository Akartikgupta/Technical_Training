// Taste of Tree Branching Recursion
public class pattern {
    public static void printline(int NumberOfLines) {
        if (NumberOfLines == 0) {
            return;
        }
        printline(NumberOfLines - 1);
        // stack is fall
        star(NumberOfLines);
        // Printing the 5 lines
        System.out.println();
    }

    public static void star(int NumberOfStars) {
        if (NumberOfStars == 0) {
            return;
        }
        System.out.print("*");
        star(NumberOfStars - 1);
    }

    public static void main(String[] args) {
        printline(5);
    }
}
