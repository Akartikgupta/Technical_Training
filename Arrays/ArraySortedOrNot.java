public class ArraySortedOrNot {
    public static boolean ArraySorted(int arr[]) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
            }
        }
        return isSorted;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 100, 100, 90, 20, 98, 99 };
        System.out.println(ArraySorted(arr) ? "Sorted" : "Not Sorted");

    }
}
