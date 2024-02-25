public class FlipDigit_Position {
    public static void main(String[] args) {
        int n = 32145;
        int pos = 0;
        int sum = 0;
        while (n > 0) {
            // get the last digit
            int digit = n % 10;
            // get the position
            pos++;
            int place = (int) Math.pow(10, digit - 1);
            sum = sum + (place * pos);
            n = n / 10;

        }
        System.out.println(sum);
    }

}
