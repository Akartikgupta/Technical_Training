public class SumOfDigit {
    // use the head recursion
    static int SumOfDigit(int num) {
        if (num == 0) {
            return 0;
        }
        int sum = SumOfDigit(num / 10);
        sum = sum + num % 10;
        return sum;
    }

    // use the tail recursion
    static void SumOfDigit(int num, int sum) {
        if (num == 0) {
            System.out.println("Sum " + sum);
            return;
        }
        int ld = num % 10;
        sum = sum + ld;
        SumOfDigit(num / 10, sum);
    }

    public static void main(String[] args) {
        // SumOfDigit(123, 0);
        System.out.println(SumOfDigit(123));
    }
}
