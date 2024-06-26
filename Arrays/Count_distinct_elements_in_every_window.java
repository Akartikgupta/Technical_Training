import java.util.ArrayList;
import java.util.HashMap;

public class Count_distinct_elements_in_every_window {
    static ArrayList<Integer> countDistinct(int arr[], int n, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        // count the elements of 1st window
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        result.add(map.size());
        for (int i = k; i < arr.length; i++) {
            // removing the first element
            if (map.get(arr[i - k]) == 1) {
                map.remove(arr[i - k]);
            } else { // decrement the count of
                map.put(arr[i - k], map.getOrDefault(arr[i - k], 0) - 1);
            }
            // adding the new element
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            result.add(map.size());
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 4, 2, 3 };
        System.out.println(countDistinct(arr, 7, 4));
    }
}
