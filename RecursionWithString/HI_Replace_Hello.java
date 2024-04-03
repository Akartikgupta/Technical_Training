public class HI_Replace_Hello {
    public static String HiReplaceHello(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            String smallString = str.substring(2);
            String result = HiReplaceHello(smallString);
            return "hello" + result;
        } else {
            String smallString = str.substring(1);
            String result = HiReplaceHello(smallString);
            char firstchar = str.charAt(0);
            return firstchar + result;
        }
    }

    public static void main(String[] args) {
        String str = "hi kartik hi tom";
        System.out.println(HiReplaceHello(str));

    }
}
