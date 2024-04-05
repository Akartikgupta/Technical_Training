public class Palindrome {
    public static void Palindrome(int org, int reverse, int num) {
        if (num == 0) {

            if (org == reverse) {
                System.out.println("Palindrome Number ");
            } else {
                System.out.println("Not a Palindrome Number");
            }
            return;
        }
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        Palindrome(org, reverse, num / 10);
    }

    public static boolean Palind(int org, int reverse, int num) {
        if (num == 0) {
            return reverse == org;
        }
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        return Palind(org, reverse, num / 10);
        // if above ans is true the it return only

    }

    public static void main(String[] args) {
        // Palindrome(122, 0, 122);
        boolean re = Palind(121, 0, 121);
        System.out.println(re ? "Palindrom" : "Not a palindrome");
    }
}
