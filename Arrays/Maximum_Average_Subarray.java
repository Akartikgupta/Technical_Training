public class Maximum_Average_Subarray {
    public static double findMaxAverage(int[] nums, int k) {
        double avgSum = 0;
        double maxAvg = 0;
        for (int i = 0; i < k; i++) {
            avgSum += nums[i];
        }
        maxAvg = avgSum / k;
        for (int i = k; i < nums.length; i++) {
            avgSum += nums[i] - nums[i - k];
            maxAvg = Math.max(maxAvg, avgSum / k);
        }
        return maxAvg;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 12, -5, -6, 50, 3 };
        System.out.println(findMaxAverage(arr, 4));
    }
}
