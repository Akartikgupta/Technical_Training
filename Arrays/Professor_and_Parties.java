import java.util.HashMap;

// https://www.geeksforgeeks.org/problems/professor-and-parties2000/1
public class Professor_and_Parties {
    public static String PartyType(long a[], int n) {
        HashMap<Long, Boolean> map = new HashMap<>();
        for (long val : a) {
            if (map.get(val) == null) {
                map.put(val, true);
            } else {
                return "BOYS";
            }
        }
        return "GIRLS";
    }

    public static void main(String[] args) {
        long arr[] = { 1, 2, 3, 4, 7 };
        System.out.println(PartyType(arr, 5));

    }
}
