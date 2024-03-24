public class SumOf_N_Natural {
    public static int sumofN(int num) {
        if (num == 0) {
            return 0;
        }
        int sum = sumofN(num / 10);
        int ld = num % 10;
        sum = sum + ld;
        return sum;
    }

    public static void sumN(int num, int sum) {
        if (num == 0) {
            System.out.println("Sum is " + sum);
            return;
        }
        int ld = num % 10;
        sum = sum + ld;
        num = num / 10;
        sumN(num, sum);
    }

    public static void main(String[] args) {
        // sumN(123, 0);
        System.out.println(sumofN(123));
    }
}
