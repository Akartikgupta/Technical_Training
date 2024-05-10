

public class Even_And_Odd_Place_Sum {
    public static void main(String[] args) {
        int num = 8765;
        int Oddsum = 0;
        int Evensum = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            if (rem % 2 == 0) {
                Evensum += rem;
            } else {
                Oddsum += rem;
            }

        }
        System.out.println("Sum of Even Digits : " + Evensum);
        System.out.println("Sum of Odd Digits : " + Oddsum);
    }

}
