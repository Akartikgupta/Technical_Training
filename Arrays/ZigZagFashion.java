import java.util.Arrays;

// https://www.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1
public class ZigZagFashion {
    public static void zigZag(int n, int[] arr) {
        // code here
        boolean zigZagFlag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (zigZagFlag) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            if (!zigZagFlag) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            zigZagFlag = (!zigZagFlag);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 7, 8, 6, 2, 1 };
        zigZag(7, arr);
    }
}