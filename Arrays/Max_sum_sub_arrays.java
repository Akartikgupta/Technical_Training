public class Max_sum_sub_arrays {
    public static long pairWithMaxSum(long arr[], long N) {
        long maxSum = Long.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            long currSum = arr[i] + arr[i + 1];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        long arr[] = { 4, 3, 1, 5, 6 };
        System.out.println(pairWithMaxSum(arr, arr.length));
    }
}
