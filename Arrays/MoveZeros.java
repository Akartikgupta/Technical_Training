import java.util.Arrays;

public class MoveZeros {
    public static void swap(int first, int last, int[] nums) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int reader = 0;
        int writer = 0;
        for (; reader < n; reader++) {
            if (nums[reader] != 0) {
                nums[writer] = nums[reader];
                writer++;
            }

        }
        for (int i = writer; i < n; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 12 };
        moveZeroes(arr);
    }
}
