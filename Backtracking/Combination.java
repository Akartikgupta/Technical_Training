import java.util.ArrayList;
import java.util.List;

public class Combination {
    public static List<List<Integer>> combine(int n, int k) {
        List<Integer> small = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        helper(n, k, 1, small, finalList);
        return finalList;
    }

    static void helper(int n, int k, int start, List<Integer> small, List<List<Integer>> finalList) {
        if (small.size() == k) {
            finalList.add(new ArrayList<Integer>(small));
            return;
        }
        // iterate all the option
        for (int i = start; i <= n; i++) {
            if (!small.contains(i)) { // When current value is not a part of smallList
                small.add(i);
                helper(n, k, i + 1, small, finalList); // Recursion Call
                // stack fall and undo
                small.remove(small.size() - 1);

            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> myList = combine(4, 2);
        System.out.println(myList);
    }
}

