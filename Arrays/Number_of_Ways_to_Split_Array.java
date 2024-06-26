public class Number_of_Ways_to_Split_Array {
    public static int waysToSplitArray(int[] nums) {
        int prefix[] = new int[nums.length];
        int validCount = 0;
        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int leftPart = prefix[i];
            int rightPart = prefix[prefix.length - 1] - prefix[i];
            if (leftPart >= rightPart) {
                validCount++;
            }
        }
        return validCount;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 4, -8, 7 };
        System.out.println(waysToSplitArray(arr));
    }
}
