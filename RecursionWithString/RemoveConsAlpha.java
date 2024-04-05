public class RemoveConsAlpha {
    public static String RemoveCons(String str) {
        // Base Case
        if (str.length() <= 1) {
            // Returning the last character
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return RemoveCons(str.substring(1));
        } else {
            return str.charAt(0) + RemoveCons(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "aaaabbbccdc";
        System.out.println(RemoveCons(str));
    }
}
