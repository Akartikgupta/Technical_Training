
//singleton
// class member and instance member
// use static otherwise make object of that method
// static is eager loader and instance load when called
// staic me aak hi memory bnte he (unique)
// This code consists of basic function of java 
import java.util.Scanner;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Salary_Slip {
    // I18N
    // Locale class
    static Locale locale;

    // For formatting the date
    static String formateDate() {
        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        String ans = df.format(date);
        return ans;
        // return df.format(date);
    }

    static ResourceBundle rb;

    // Use to remove the hardcore typing input
    //
    static void loadBundle() {
        rb = ResourceBundle.getBundle("message", locale);
    }

    static String formatCurrency(double unformatedval) {
        // NumberFormat n2=new NumberFormat()

        // yaha pr Numberformat ka object ni bnayega bcz it is abstract class --> object
        // cannot be made for abstract class
        // why abstract class Object not made?
        // bcz it is a base class means it is contains the same common features

        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(unformatedval); // $1000,000,000
        // ans is converted into a String
    }

    public static String properCase(String name) {
        String fullname = "";
        String names[] = name.split(" ");
        for (int i = 0; i < names.length; i++) {
            String n = String.valueOf(names[i].charAt(0)).toUpperCase() + names[i].substring(1).toLowerCase();
            fullname = fullname + n + " ";
            // String n = names[i];
            // char firstletter = n.charAt(0);
            // String firstletteruppercase = String.valueOf(firstletter).toUpperCase();
            // String remString = n.substring(1).toLowerCase();
            // String result = firstletteruppercase + remString + " ";
            // fullname = fullname + result;
        }

        return fullname;
    }

    public static void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 for English");
        System.out.println("हिंदी के लिए 2 दर्ज करें");
        int choice = sc.nextInt();
        if (choice == 1) {
            locale = new Locale("en", "US");
        } else if (choice == 2) {
            locale = new Locale("hi", "HI");
        }
        loadBundle();
        // System.out.println("Enter the ID :");
        System.out.println(rb.getString("id.msg"));
        int id = sc.nextInt();
        sc.nextLine();
        // System.out.println("Enter the name of Employee :");
        System.out.println(rb.getString("name.msg"));
        String name = sc.nextLine();
        // System.out.println("Enter the Basic Salary :");
        System.out.println(rb.getString("salary.msg"));
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
        System.out.println("Today is " + formateDate());
        System.out.println("ID :" + id);
        System.out.println("Name :" + properCase(name));
        System.out.println("Basic Salary :" + formatCurrency(Salary));
        System.out.println("Allowance \t\t Deduction");
        System.out.println("HRa " + formatCurrency(hr) + "\t\t" + "  PF " + formatCurrency(pf));
        System.out.println("TA " + formatCurrency(ta));
        System.out.println("MA " + formatCurrency(ma));
        System.out.println("DA " + formatCurrency(da));

    }

    public static void main(String[] args) {
        Input();

    }
}
