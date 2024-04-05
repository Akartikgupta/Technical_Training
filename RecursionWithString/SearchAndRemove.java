public class SearchAndRemove {
    public static String SearchAndRemove(String str, char search) {
        // Base Case
        if (str.length() == 0) {
            return "";
        }
        String smalString = SearchAndRemove(str.substring(1), search);
        if (str.charAt(0) == search) {
            return smalString;
        } else {
            return str.charAt(0) + smalString;
        }
    }

    public static void main(String[] args) {
        String re = SearchAndRemove("hello", 'l');
        System.out.println(re);
    }
}
