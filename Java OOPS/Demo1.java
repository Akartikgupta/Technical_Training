// class is blueprint
// class -Pascalcase

import java.util.Scanner;

// encapsulation --> Binding the data and methods into a single unit and that unit is called class
// good encapsulation - data hiding 
class Employee {
    // features
    // member of class employee
    // private --> limited to class (Access Specifier)
    private int id; // when object is created then only memory allocated --> instance variable
    private String name;
    private double salary;
    private String CampanyName = "SkillRiser";

    // class name and constructor name is same
    // constructor not return anything even it is void
    // when you create object u call constructor
    // it is used to initialesed the instance variable of class
    // every class by defualt has default constructor
    // this construction will do nothing
    // it is just empty
    Employee() {

        // id = 100;
        // name = "Balaji";
        // salary = 0.0;
        CampanyName = "SkillRiser";
    }

    // contructor overloading
    // parameterised constructor
    Employee(int id, String name, double salary) {
        this(); // calling default constructor
        // this cannot plcae in down
        System.out.println("This is Parameterised Constructor");
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void input(int id, String name, double salary) {
        if (id >= 0 || salary <= 0) {
            System.out.println("Invalid Input");
            return;
        }
        // this - optional to write
        // this is keyword
        // I contain the current calling object reference
        // member variable = local value this.id = id
        // local value = local value id=id shadow problem
        this.id = id; // without this can be access
        this.name = name;
        this.salary = salary;
        // this actually solve the shadow problem
    }

    void output() {
        System.out.println("CampanyName " + CampanyName);
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.salary);

    }

    // setter and getter
    public void setsalary(double salary) {
        this.salary = salary;
    }

    public double getsalary() {
        return salary;
    }
}

class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ram is local variable
        Employee ram; // ram is a variable of type employee
        // ram = new Employee();
        ram = new Employee(100, "Ram", 100.00);
        ram.setsalary(ram.getsalary() + 2000);
        // System.out.println("Enter the id");
        // int id = sc.nextInt();
        // sc.nextLine();
        // System.out.println("Enter the name");
        // String name = sc.nextLine();
        // System.out.println("Enter the salary");
        // double salary = sc.nextDouble();
        // ram.input(id, name, salary);
        ram.output();
        sc.close();
        // System.out.println(ram.id);
        // System.out.println(ram.name);
        // System.out.println(ram.salary);
        // ram.id = 1101;
        // ram.name = "Ram";
        // ram.salary = 10000.00;
        // System.out.println(ram.id);
        // System.out.println(ram.name);
        // System.out.println(ram.salary);
        // // new Employee() create an object
        // new is a keyword
        // new allocate memory dynamically
        int x; // x is variable of type int
        x = 100;

    }
}
