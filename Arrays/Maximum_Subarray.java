// https://leetcode.com/problems/maximum-subarray/description/
public class Maximum_Subarray {
    public static int maxSubArray(int[] nums) {
        // int sum = nums[0];
        // int max = nums[0];
        // for (int i = 1; i < nums.length; i++) {
        // sum = Math.max(nums[i], sum + nums[i]);
        // max = Math.max(max, sum);
        // }
        // return max;
        int sum = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            max = sum > max ? sum : max;
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(nums));
    }
}
