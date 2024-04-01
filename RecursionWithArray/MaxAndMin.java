public class MaxAndMin {
    public static int[] getMaxMin(int arr[], int index) {
        // Base case
        if (arr.length == index) {
            int result[] = new int[2];
            // assigning the default values as it not worked properly for the value 0
            result[0] = Integer.MAX_VALUE;
            result[1] = Integer.MIN_VALUE;
            return result;
        }
        // small problem
        int result[] = getMaxMin(arr, index + 1);
        // Get the minimum in the Array
        if (result[0] > arr[index]) {
            result[0] = arr[index];
        } // get the maximum in the array
        else if (result[1] < arr[index]) {
            result[1] = arr[index];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 203, 4020, 0420, 1, 180 };
        int result[] = getMaxMin(arr, 0);
        System.out.println("Min is :" + result[0] + "  Max is :" + result[1]);
    }
}
