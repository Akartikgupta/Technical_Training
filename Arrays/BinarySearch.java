public class BinarySearch {
    public static void main(String[] args) {
        int ar[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int low = 0;
        int high = ar.length - 1;
        int search = 70;
        while (low < high) {
            int mid = (low + high) / 2;
            if (search == ar[mid]) {
                System.out.println("Element Found");
                return; // exit from the main function
            }
            if (search > ar[mid]) {
                low = mid + 1;// move to the right
            } else if (search < ar[mid]) {
                high = mid - 1; // move to the left side
            }
        }
        System.out.println("Element not found");
    }
}
