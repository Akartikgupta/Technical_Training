public class SearchInArray {
    public static void isPresent2(int arr[], int index, int target) {
        if (index == arr.length) {
            System.out.println("Element is Not Present");
            return;
        }
        if (arr[index] == target) {
            System.out.println("Element is Present");
            return;

        }
        // small problem
        isPresent2(arr, index + 1, target);
    }

    public static boolean isPresent(int arr[], int index, int target) {
        if (index == arr.length) {
            return false;
        }
        if (arr[index] == target) {
            return true;
        }
        // small problem
        return isPresent(arr, index + 1, target);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        // System.out.println(isPresent(arr, 0, 50) ? "Element is Present" : "Element is
        // not Present");
        isPresent2(arr, 0, 40);
    }
}
