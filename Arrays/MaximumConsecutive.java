public class MaximumConsecutive {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            }
            if (nums[i] == 0) {
                count = 0;
            }
            if (count > result) {
                result = count;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 1, 1 };
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
