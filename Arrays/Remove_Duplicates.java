// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class Remove_Duplicates {
    public static int removeDuplicates(int nums[]) {
        if (nums.length == 0) {
            return 0;
        }
        int reader = 1;
        int writer = 0;
        for (; reader < nums.length; reader++) {
            if (nums[writer] != nums[reader]) {
                writer++;
                nums[writer] = nums[reader];
            }
        }
        return writer + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2 };
        System.out.println(removeDuplicates(arr));
    }
}
