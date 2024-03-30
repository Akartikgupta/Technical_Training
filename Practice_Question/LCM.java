public class LCM {
    public static void main(String[] args) {
        // LCM=(a*b)/GCD(a*b)
        int a = 12;
        int b = 16;
        int acpy = a;
        int bcpy = b;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        int GCD = a;
        int LCM = (acpy * bcpy) / GCD;
        System.out.println("LCM is " + LCM);
    }
}
