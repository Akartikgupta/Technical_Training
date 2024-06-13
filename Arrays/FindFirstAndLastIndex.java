public class FindFirstAndLastIndex {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 33, 33, 33, 33, 40, 50, 60, 70 };
        int search = 33;
        int firstIndex = -1;
        int lastIndex = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == search) {
                // assume this would be the firstindex
                firstIndex = mid;
                // firstindex will be found on left, where lasy index
                // will be found on right
                high = mid - 1;
            } else if (search > arr[mid]) {
                low = mid + 1;
            } else if (search < arr[mid]) {
                high = mid - 1;
            }
        }
        System.out.println("firstIndex " + firstIndex);
        low = 0;
        high = arr.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == search) {
                // assume this would be the firstindex
                lastIndex = mid;
                // firstindex will be found on left, where lasy index
                // will be found on right
                low = mid + 1;
            } else if (search > arr[mid]) {
                low = mid + 1;
            } else if (search < arr[mid]) {
                high = mid - 1;
            }
        }
        System.out.println("LastIndex " + lastIndex);
        System.out.println("Occur " + (lastIndex - firstIndex + 1));
    }
}
