public class RopeCut {
    // a, b, c are the possible cuts
    public static int getmax(int ropelen, int a, int b, int c) {
        if (ropelen == 0) {
            return 0;
        }
        if (ropelen < 0) {
            return -1;
        }
        int option1 = getmax(ropelen - a, a, b, c);
        int option2 = getmax(ropelen - b, a, b, c);
        int option3 = getmax(ropelen - c, a, b, c);
        int result = Math.max(option3, Math.max(option1, option2));
        if (result == -1) {
            return -1;
        }
        return result + 1;
    }

    public static void main(String[] args) {
        int maxCut = getmax(5, 2, 5, 3);
        System.out.println(maxCut == -1 ? "Not abke to cut it" : "Maximum no. of cuts " + maxCut);
    }
}
