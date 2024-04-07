public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n == 0) {
            return 1;// countes as 1
        }
        if (n < 0) {
            return 0;// not counted
        }
        int count1 = climbStairs(n - 1);
        int count2 = climbStairs(n - 2);
        return count1 + count2;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
}
