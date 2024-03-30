import java.util.HashMap;

public class Freq_Count_Digit {
    public static void main(String[] args) {
        int num = 722773;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (num != 0) {
            int digit = num % 10;
            if (map.get(digit) == null) {
                map.put(digit, 1);
            } else {
                int count = map.get(digit);
                count++;
                map.put(digit, count);
            }
            num /= 10;
        }
        System.out.println(map);
    }
}
