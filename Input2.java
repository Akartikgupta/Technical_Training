package Work;

public class Input2 {
    public static void main(String[] args) {
        System.out.println("Enter the password");
        char pwd[] = System.console().readPassword();
        // String g = "hello";
        System.out.println(pwd.toString());
    }
}