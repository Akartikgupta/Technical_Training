
public class Power_Of_Number {
    public static int Power(int num, int power) {
        // Base condition
        if (power == 0) {
            return 1;
        }
        int result = Power(num, power - 1);
        return result * num;
    }

    public static void Power(int num, int power, int sum) {
        // base condition
        if (power == 0) {
            System.out.println("Sum is :" + sum);
            return;
        }
        // small problem
        sum = sum * num;
        Power(num, power - 1, sum);
    }

    public static void main(String[] args) {
        int num = 2;
        int power = 5;
        // Power(num, power, 1);
        System.out.println(Power(num, power));
        ;

    }
}
