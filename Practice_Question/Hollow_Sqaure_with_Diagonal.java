public class Hollow_Sqaure_with_Diagonal {
    public static void main(String[] args) {
        int range = 11;
        for (int row = 1; row <= range; row++) {
            for (int col = 1; col <= range; col++) {

                if (row == 1 || col == 1 || row == range || col == range || row == col || col == range - row + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
