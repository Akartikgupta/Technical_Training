
public class StrongNumber {
    public static boolean StrongNumber(int num, int org, int sum) {
        if (num == 0) {
            if (org == sum) {
                return true;
            } else {
                return false;
            }
        }
        int ld = num % 10;
        int fact = factorial(ld);
        sum = sum + fact;
        return StrongNumber(num / 10, org, sum);

    }

    public static void Strong(int num, int sum, int org) {
        // Find each digit factorail and add to the sum
        if (num == 0) {
            System.out.println(org == sum ? "Strong Number" : "Not a Strong Number");
            return;
        }
        int ld = num % 10;
        int fact = factorial(ld);
        sum = sum + fact;
        Strong(num / 10, sum, org);

    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        int ans = num * factorial(num - 1);
        return ans;

    }

    public static void main(String[] args) {
        // Strong(145, 0, 145);
        boolean ans = StrongNumber(145, 145, 0);
        System.out.println(ans == true ? "Strong Number" : "Not a Strong Number");
    }
}
