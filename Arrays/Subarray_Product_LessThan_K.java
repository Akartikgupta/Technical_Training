public class Subarray_Product_LessThan_K {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int left = 0;
        int count = 0;
        int product = 1;
        for (int right = 0; right < nums.length; right++) {
            product = product * nums[right];
            while (product >= k) {
                product = product / nums[left];
                left++;
            }
            count = count + right - left + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 6 };
        System.out.println(numSubarrayProductLessThanK(arr, 100));
    }
}
