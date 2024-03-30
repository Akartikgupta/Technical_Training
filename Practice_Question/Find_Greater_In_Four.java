public class Find_Greater_In_Four {
    public static void main(String[] args) {
        int a = 110;
        int b = 120;
        int c = 130;
        int d = 40;
        if (a > b) {
            if (a > c) {
                if (a > d) {
                    System.out.println("a is greater ...");
                } else {
                    System.out.println("d is greater ..");
                }
            } else {
                if (c > d) {
                    System.out.println("c is greater ...");
                } else {
                    System.out.println("d is greater ..");
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    System.out.println("b is greater ..");
                } else {
                    System.out.println("d is greater ..");
                }
            } else {
                if (c > d) {
                    System.out.println("c is greater ..");
                } else {
                    System.out.println("d is greater");
                }
            }
        }
    }
}
