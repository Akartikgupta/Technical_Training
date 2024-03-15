public class CountEven_Odd {
    // static int[] CountEven_Odd(int num) {
    // // if (num == 0) {
    // // return 0;
    // // }
    // // int va = va + CountEven_Odd(num - 1);
    // // if (va % 2 == 0) {

    // // }
    // }

    static void CountEven_Odd(int num, int evenCount, int oddCount) {
        if (num == 0) {
            System.out.println(evenCount);
            System.out.println(oddCount);
            return;
        }
        if (num % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
        CountEven_Odd(num - 1, evenCount, oddCount);
    }

    public static void main(String[] args) {
        CountEven_Odd(11, 0, 0);
    }
}
