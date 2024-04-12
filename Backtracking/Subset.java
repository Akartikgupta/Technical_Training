import java.util.ArrayList;
import java.util.List;

// Index Base Question
public class Subset {
    public static List<List<Integer>> subset(int[] nums) {
        List<Integer> small = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        helper(nums, 0, small, finalList);
        return finalList;

    }

    static void helper(int[] nums, int index, List<Integer> small, List<List<Integer>> finalList) {

        finalList.add(new ArrayList<Integer>(small)); // Creating a new Arraylist for every object as we works
                                                      // on a
        // There is no base requires as for is exhausted
        // iterate all the option
        for (int i = index; i < nums.length; i++) {
            // When current value is not a part of smallList
            if (!small.contains(nums[i])) {
                small.add(nums[i]);
                helper(nums, i, small, finalList); // Recursion Call
                // i will be imcremented when stack fall, it means for next recursion call index
                // will be pass as incremented value
                // stack fall and undo
                small.remove(small.size() - 1);

            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        List<List<Integer>> myList = subset(arr);
        for (List<Integer> item : myList) {
            System.out.println(item);
        }
    }
}
// steps
// loop (3 Branch)
// Recursion
// Maintaning index
// small arr
// big arr(small)
