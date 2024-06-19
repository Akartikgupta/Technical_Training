import java.util.ArrayList;
import java.util.Collections;

// https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
class LeadersArray {

    public static ArrayList<Integer> leaders(int arr[], int n) {
        // Your code here
        int leader = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= leader) {
                leader = arr[i];
                list.add(leader);
            }
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        int ar[] = { 16, 17, 4, 3, 5, 2 };
        System.out.println(leaders(ar, 6));
        ;
    }
}
