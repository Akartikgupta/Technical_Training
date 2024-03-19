public class CountNoOfZero {
    public static int CountNoOfZero(int num) {
        if (num == 0) {
            return 0;
        }
        int count = CountNoOfZero(num / 10);
        int ld = num % 10;
        if (ld == 0) {
            count++;
        }
        return count;
    }

    public static void CountZero(int num, int count) {
        // Base condition
        if (num == 0) {
            System.out.println(count);
            return;
        }
        int ld = num % 10;
        if (ld == 0) {
            count++;
        }
        num = num / 10;
        CountZero(num, count);

    }

    public static void main(String[] args) {
        // CountZero(12000, 0);
        System.out.println(CountNoOfZero(12000));
    }
}
