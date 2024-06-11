// Array works only on pass by value(pass by copy) in java
public class ArrayDemo {
    static void show(int arr[]) {
        arr[0] = 100;
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int marks = 90;
        int mark[] = { 90, 75, 55 };
        int[] n = { 234, 324 };
        int g[] = new int[4];
        int[] g1 = new int[] { 23, 234 };
        show(mark);
        System.out.println("After call");
        for (int i : mark) {
            System.out.println(i);
        }

    }
}