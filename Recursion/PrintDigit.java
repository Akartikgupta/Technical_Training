import java.util.ArrayList;

public class PrintDigit {
    // public static int[] PrintDigit(int n){
    // if(n==0){
    // return 0;
    // }
    // PrintDigit(n / 10);
    // int ld = n % 10;
    // }
    public static void printDigit(int n) {
        if (n == 0) {
            return;
        }
        printDigit(n / 10);
        int ld = n % 10;
        System.out.println(ld);
    }

    public static void main(String[] args) {
        printDigit(12345);
    }
}
