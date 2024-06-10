public class KSizeWindowSum {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int[] nums = { 3, -1, 4, 12, -8, 5, 6 };
        int k = 5; // size of window
        int sum = 0;
        // compute the sum of first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max = sum;
        // now compute the sum of rest of the window
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k]; // add the right part and minus the left part
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}

