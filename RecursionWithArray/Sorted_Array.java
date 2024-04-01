
public class Sorted_Array {
    public static void isSorted2(int arr[], int index) {
        // Base case
        if (index == arr.length - 1) {
            System.out.println("Sorted");
            return;
        }
        if (arr[index] > arr[index + 1]) {
            System.out.println("Not Sorted");
            return;
        }
        // small problem is to check whether the element is lesser than the next one or
        // not
        isSorted2(arr, index + 1);
    }

    public static boolean isSorted(int arr[], int index) {
        // Base case
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        // small problem
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        // System.out.println(isSorted(arr, 0) ? "Sorted" : "Not Sorted");
        isSorted2(arr, 0);
    }
}
