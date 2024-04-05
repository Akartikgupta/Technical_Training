public class ReverseString {
    public static String Reverse(String str) {
        // Base case
        if (str.length() == 0) {
            return "";
        }
        String smallString = Reverse(str.substring(1));
        char ch = str.charAt(0);
        return smallString + ch;
    }

    public static void main(String[] args) {
        String str = "kartik";
        String re = Reverse(str);
        System.out.println(re);
    }
}