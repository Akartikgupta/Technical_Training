public class SearchAndReplace {
    public static String SearchAndReplace(String str, char search, char replace) {
        // Base Case
        if (str.length() == 0) {
            return "";
        }
        String smalString = SearchAndReplace(str.substring(1), search, replace);
        if (str.charAt(0) == search) {
            return replace + smalString;
        } else {
            return str.charAt(0) + smalString;
        }
    }

    public static void main(String[] args) {
        String re = SearchAndReplace("hello", 'l', 'x');
        System.out.println(re);
    }
}

