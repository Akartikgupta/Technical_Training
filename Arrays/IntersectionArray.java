import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
// https://leetcode.com/problems/intersection-of-two-arrays/
public class IntersectionArray {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }
        int arr[] = new int[set2.size()];
        int k = 0;
        for (int num : set2) {
            arr[k++] = num;
        }
        return arr;

    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 2, 1 };
        int nums2[] = { 2, 2 };
        // intersection(nums1, nums2);
        int arr[] = intersection(nums1, nums2);
        System.out.println(Arrays.toString(arr));
    }
}