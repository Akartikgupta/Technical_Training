import java.util.Arrays;

// https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
public class ReaRerrange_Array_Elements_by_Sign {

    public static int[] rearrangeArray(int[] nums) {
        int ans[] = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else if (nums[i] < 0) {
                ans[neg] = nums[i];
                neg += 2;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 1, -2, -5, 2, -4 };
        int ans[] = rearrangeArray(nums);
        System.out.println(Arrays.toString(ans));

    }
}
