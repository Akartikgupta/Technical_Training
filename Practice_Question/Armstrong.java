
public class Armstrong {
    public static void main(String[] args) {
        int num = 211;
        int Count = 0;
        int cpy = num;
        int n = num;
        while (cpy > 0) {
            cpy = cpy / 10;
            Count++;
        }
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = (int) (sum + Math.pow(digit, Count));
            num = num / 10;
        }
        if (sum == n) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not a armstrong");
        }
    }
}
