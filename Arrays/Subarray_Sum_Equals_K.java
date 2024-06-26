public class Subarray_Sum_Equals_K {
    public static int subarraySum(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while (left <= right) {
            int re = nums[left] + nums[right];
            if (re == k) {
                count++;
                left++;
                right--;
            } else if (re < k) {
                left++;
            } else if (re > k) {
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1 };
        System.out.println(subarraySum(nums, 2));

    }
}
