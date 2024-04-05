public class Factorial {
    public static int Fact(int n) {
        // One time work
        if (n == 1) {
            return 1;
        }
        // Repetition Part
        int ans = Fact(n - 1);
        ans = ans * n;
        return ans;
    }

    public static void Factorial(int n, int fact) {
        if (n == 1) {
            System.out.println("Fact = " + fact);
            return;
        }

        Factorial(n - 1, n * fact);

    }

    public static void main(String[] args) {
        Factorial(5, 1);
        System.out.println("Fact = " + Fact(5));
        ;
    }
}
