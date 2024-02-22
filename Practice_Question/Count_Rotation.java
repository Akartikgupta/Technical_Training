public class Count_Rotation {
    public static void main(String[] args) {
        int num = 12345;
        int rotation = 8;
        int Count = 0;
        int cpy = num;
        // Count the digits
        while (cpy > 0) {
            cpy = cpy / 10;
            Count++;
        }
        rotation = rotation % Count;
        // for the negative values
        if (rotation < 0) {
            rotation = rotation + Count;
        }
        // modulus krke 45 mila
        int rhs = num % (int) Math.pow(10, rotation);
        // divide krke 123 mila
        int lhs = num / (int) Math.pow(10, rotation);

        // 45*1000 + 123
        int result = rhs * (int) Math.pow(10, Count - rotation) + lhs;
        System.out.println(result);
    }

}
