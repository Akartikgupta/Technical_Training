import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class sts {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here

        ArrayList<Integer> list = new ArrayList<>();
        int leaders = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (leaders <= arr[i]) {
                leaders = arr[i];
                list.add(leaders);
            }
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        // leaders(arr.length, arr);
        System.out.println(leaders(arr.length, arr));
    }
}
