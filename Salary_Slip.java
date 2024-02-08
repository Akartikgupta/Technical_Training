
// class member and instance member
// use static otherwise make object of that method
// static is eager loader and instance load when called
// staic me aak hi memory bnte he (unique) 
import java.util.Scanner;

public class Salary_Slip {
    // I18N
    // Locale class

    public static String properCase(String name) {
        String names[] = name.split(" ");
        String fullname = "";
        for (int i = 0; i < names.length; i++) {
            String n = names[i];
            char firstletter = n.charAt(0);
            String firstletteruppercase = String.valueOf(firstletter).toUpperCase();
            String remString = n.substring(1).toLowerCase();
            String result = firstletteruppercase + remString + " ";
            fullname = fullname + result;
        }
        return fullname;
    }

    public static void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID :");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of Employee :");
        String name = sc.nextLine();
        System.out.println("Enter the Basic Salary :");
        double Salary = sc.nextDouble();
        calculate(id, name, Salary);

    }

    public static void calculate(int id, String name, double Salary) {
        double hr = Salary * 0.50;
        double ta = Salary * 0.40;
        double ma = Salary * 0.25;
        double da = Salary * 0.20;
        double pf = Salary * 0.05;
        printing(id, name, Salary, hr, da, ta, ma, pf);

    }

    public static void printing(int id, String name, double Salary, double hr, double da, double ta, double ma,
            double pf) {
        System.out.println("ID :" + id);
        System.out.println("Name :" + properCase(name));
        System.out.println("Basic Salary :" + Salary);
        System.out.println("Allowance \t\t Deduction");
        System.out.println("HRa " + hr + "\t\t" + "  PF " + pf);
        System.out.println("TA " + ta);
        System.out.println("MA " + ma);
        System.out.println("DA " + da);

    }

    public static void main(String[] args) {
        Input();

    }
}
