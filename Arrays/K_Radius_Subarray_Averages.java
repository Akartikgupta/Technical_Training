import java.util.Arrays;

public class K_Radius_Subarray_Averages {
    public static int[] getAverages(int[] nums, int k) {
        if (k < 1) {
            return nums;
        }
        int[] avgs = new int[nums.length];
        Arrays.fill(avgs, -1);
        long sum = 0;
        int windowSize = 2 * k + 1; // +1 is used to include the kth value
        int n = nums.length;
        // if array is too small
        if (n < windowSize) {
            return nums;
        }
        if (n < k) {
            return avgs[-1];
        }
        for (int i = 0; i < windowSize; i++) {
            sum += nums[i];
        }
        avgs[k] = (int) (sum / windowSize);
        for (int i = k + 1; i < n - k; i++) {
            sum += nums[i + k] - nums[i - k - 1];
            avgs[i] = (int) (sum / windowSize);
        }
        return avgs;

    }

    public static void main(String[] args) {
        int nums[] = { 7, 4, 3, 9, 1, 8, 5, 2, 6 };
        int arr[] = getAverages(nums, 3);
        System.out.println(Arrays.toString(arr));
    }
}
