import java.util.Arrays;

public class LongestConsecutive_Sequence {
    public static int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int longest = 1;
        int count = 0;
        int lastSmaller = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 == lastSmaller) {
                lastSmaller = arr[i];
                count++;
            } else if (arr[i] != lastSmaller) {
                count = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
        // int count = 1;
        // int lastSmaller = arr[0];
        // for (int i = 0; i < arr.length; i++) {
        // int x = arr[i];
        // if (lastSmaller == (x - 1)) {
        // count++;
        // lastSmaller = arr[i];
        // }
        // }
        // return count;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6 };
        System.out.println(longestConsecutive(arr));
    }
}
