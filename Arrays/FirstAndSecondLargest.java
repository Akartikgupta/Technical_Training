import java.util.ArrayList;
import java.util.List;

public class FirstAndSecondLargest {
    static void FirstAndSecondLargest(int arr[]) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] != first && second < arr[i]) {
                second = arr[i];
            }
        }
        System.out.println(first + "  " + second);
    }

    public static void main(String[] args) {
        int arr[] = { 100, 100, 100, 90, 20, 98, 99 };
        FirstAndSecondLargest(arr);
    }
}
