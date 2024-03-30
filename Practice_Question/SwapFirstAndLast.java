
public class SwapFirstAndLast {
    public static void main(String[] args) {
        int num = 123456;
        int cpy = num;
        int Count = 0;
        while (cpy > 0) {
            cpy = cpy / 10;
            Count++;
        }
        int pow = (int) Math.pow(10, Count - 1);
        // last digit
        int ld = num % 10;
        // first digit
        int fd = num / pow;
        num /= 10;
        // excluding the 2 digit to get the middle power
        int pow2 = (int) (Math.pow(10, Count - 2));
        int mid = num % pow2;
        // swap the first and last digit add the middle in between by multipling by 10
        int result = ld * pow + mid * 10 + fd;
        System.out.println(result);

    }

}
