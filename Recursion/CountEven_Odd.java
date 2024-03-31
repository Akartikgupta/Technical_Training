public class CountEven_Odd {
    // Using an Array method
    static int[] CountEven_Odd(int num) {
        if (num == 0) {
            int result[] = new int[2];
            return result;
        }
        int result[] = CountEven_Odd(num - 1);
        if (num % 2 == 0) {
            result[0] += 1;
        } else {
            result[1] += 1;
        }
        return result;

    }
// Using the void method
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
