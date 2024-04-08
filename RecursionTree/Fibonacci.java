public class Fibonacci {
    public static int Fib(int num) {
        // base case
        if (num <= 1) {
            return num;
        }
        int firstterm = Fib(num - 1);
        int secondterm = Fib(num - 2);
        return firstterm + secondterm;
        // return Fib(num-1)+Fib(num-2);
    }

    public static void main(String[] args) {
        int r = Fib(6);
        System.out.println(r);
    }
}
// TIme Complexity is exponential 2^n
// Brute force