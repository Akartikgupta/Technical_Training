
public class Even_And_Odd_Place_Sum {
    public static void EvenandOdd(int n) {
        int evenPos = 0;
        int oddPos = 0;
        int pos = 0;
        while (n > 0) {
            int digit = n % 10;
            pos++;
            if (pos % 2 == 0) {
                evenPos += digit;
            } else {
                oddPos += digit;
            }
            n = n / 10;
        }
        System.out.println("Sum of Even Digits : " + evenPos);
        System.out.println("Sum of Odd Digits : " + oddPos);
    }

    public static void main(String[] args) {
        int num = 8765;
        EvenandOdd(num);
        // int Oddsum = 0;
        // int Evensum = 0;
        // while (num > 0) {
        // int rem = num % 10;
        // num = num / 10;
        // if (rem % 2 == 0) {
        // Evensum += rem;
        // } else {
        // Oddsum += rem;
        // }

        // }
        // System.out.println("Sum of Even Digits : " + Evensum);
        // System.out.println("Sum of Odd Digits : " + Oddsum);
    }

}
