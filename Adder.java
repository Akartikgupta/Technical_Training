public class Adder {
    public static void main(String[] args) {
        int sum = 0;
        // for (int i = 0; i < args.length; i++) {
        // sum = sum + Integer.parseInt(args[i]);
        // }
        // Enhanced for loop (Java 5)
        for (String a : args) {
            sum = sum + Integer.parseInt(a);
        }
        System.out.println(sum);
    }
}
// java adder 10 20 30
// java adder
// Bat/ shell programming