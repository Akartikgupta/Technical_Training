import java.util.Arrays;

public class Segragate0And1And2 {
    static void swap(int firstIndex, int secondIndex, int arr[]) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    public static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (mid <= high) {
            int currentValue = nums[mid];
            // low to mid
            if (currentValue == 0) {
                swap(low, mid, nums);
                low++;// move towards rightmost boundary
                mid++;
            }
            // move mid
            else if (currentValue == 1) {
                mid++;
            }
            // mid to high
            else if (currentValue == 2) {
                swap(mid, high, nums);
                high--; // move to the left most boundary
            }

        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 2, 0, 1 };
        sortColors(arr);
    }
}
