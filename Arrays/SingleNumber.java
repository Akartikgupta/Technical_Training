import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int SingleNumber(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // Return the key (number) which has a count of 1
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
        // int result = 0;
        // for (int num : nums) {
        // result ^= num;
        // }
        // return result;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1 };
        System.out.println(SingleNumber(arr));

    }
}
