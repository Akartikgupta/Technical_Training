import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> small = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        helper(nums, small, finalList);
        return finalList;

    }

    static void helper(int[] nums, List<Integer> small, List<List<Integer>> finalList) {
        if (nums.length == small.size()) {
            finalList.add(new ArrayList<Integer>(small)); // Creating a new Arraylist for every object as we works on a
                                                          // same address
            return;
        }
        // iterate all the option
        for (int i = 0; i < nums.length; i++) {
            if (!small.contains(nums[i])) { // When current value is not a part of smallList
                small.add(nums[i]);
                helper(nums, small, finalList); // Recursion Call
                // stack fall and undo
                small.remove(small.size() - 1);

            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        List<List<Integer>> myList = permute(arr);
        for (List<Integer> item : myList) {
            System.out.println(item);
        }

    }
}
