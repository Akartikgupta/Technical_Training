public class FindTheLongestSum {
    // sliding window uses the concept of 2 pointers
    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 7, 4, 2, 1, 1, 5 };
        int k = 8;
        // maintain two pointers
        int left = 0;
        int currentsum = 0;
        int max = 0;
        // move to the right till the given constraint is valid
        for (int right = 0; right < arr.length; right++) {
            currentsum = currentsum + arr[right];
            // if constraint is not valid so keep removing the left added values
            while (currentsum > k) {
                currentsum = currentsum - arr[left];
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        System.out.println(max);
    }
}
