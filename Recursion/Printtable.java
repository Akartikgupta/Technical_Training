public class Printtable {
    public static String Print2(int n, int val) {
        if (val == 0) {
            return "";
        }
        String result = Print2(n, val - 1);
        String expression = n + "*" + result + "=" + (n * val) + "\n";
        return result + expression;

    }

    public static void print(int n, int result) {
        if (result == 11) {
            return;
        }
        System.out.println(n + "*" + result + "= " + (n * result));
        print(n, result + 1);

    }

    public static void main(String[] args) {
        // print(2, 1);
        String r = Print2(2, 10);
        System.out.println(r);
    }
}
