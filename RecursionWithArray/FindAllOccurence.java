import java.util.Arrays;

public class FindAllOccurence {
    public static int[] findAllHelper(int arr[], int search, int index, int count) {
        // Base case
        if (arr.length == index) {
            int result[] = new int[count];
            return result;
        }
        // for counting the occurance of a number
        if (arr[index] == search) {
            count++;
        }
        int result[] = findAllHelper(arr, search, index + 1, count);
        if (arr[index] == search) {
            result[count - 1] = index;
        }
        return result;
    }

    // Using the helper method to get the occurance of a number
    public static int[] FindAllOccurence(int arr[], int search, int index) {
        return findAllHelper(arr, search, index, 0);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 50, 40, 50, 60 };
        int result[] = FindAllOccurence(arr, 50, 0);
        System.out.println(Arrays.toString(result));
    }
}
