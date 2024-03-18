public class Armstrong {
    public static void Strong(int num, int result, int org) {
        if (num == 0) {
            System.out.println(result == org ? "Armstrong Number" : "Not an Armstrong Number");
            return;
        }
        int ld = num % 10;
        int count = Count(org);
        result = result + (int) (Math.pow(ld, count));
        Strong(num / 10, result, org);
    }

    private static int Count(int org) {
        if (org == 0) {
            return 0;
        }
        int count = Count(org / 10);
        count++;
        return count;
    }

    public static boolean Strong2(int num, int result, int org) {
        if (num == 0) {
            if (org == result) {
                return true;
            } else {
                return false;
            }

        }
        int ld = num % 10;
        int count = Count(org);
        result = result + (int) (Math.pow(ld, count));
        return Strong2(num / 10, result, org);
    }

    public static void main(String[] args) {
        int num = 40;
        // Strong(num, 0, num);
        boolean ans = Strong2(num, 0, num);
        System.out.println(ans ? "Armstrong Number" : "Not an Armstrong Number");

    }
}
