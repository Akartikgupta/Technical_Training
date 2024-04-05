public class PrintAdjacentStar {
    public static String PrintAdjStar(String str) {
        // Base case
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            char firstchar = str.charAt(0);
            String result = PrintAdjStar(str.substring(1));
            return firstchar + "*" + result;
            // return str.charAt(0) + "*" + PrintAdjStar(str.substring(1));
        } else {
            char firstchar = str.charAt(0);
            String result = PrintAdjStar(str.substring(1));
            return firstchar + result;
            // return str.charAt(0) + PrintAdjStar(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "aabb";
        System.out.println(PrintAdjStar(str));
    }
}
