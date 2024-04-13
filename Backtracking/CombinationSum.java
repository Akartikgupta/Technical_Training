import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> small = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        helper(candidates, target, 0, 0, small, finalList);
        return finalList;
    }

    static void helper(int nums[], int target, int sum, int index, List<Integer> small, List<List<Integer>> finalList) {
        if (sum == target) {
            finalList.add(new ArrayList<Integer>(small));
            return;
        }
        // iterate all the option
        for (int i = index; i < nums.length; i++) {
            if (sum + nums[i] <= target) {
                small.add(nums[i]);

                helper(nums, target, sum + nums[i], i, small, finalList); // Recursion Call

                small.remove(small.size() - 1);
            }
            // stack fall and undo

        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> myList = combinationSum(arr, target);
        System.out.println(myList);
    }
}
