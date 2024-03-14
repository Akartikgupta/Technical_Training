public class RecursionDemo {
    static void show(int n) {
        // Base Condition
        // Termination case
        if (n == 0) {
            return; // exit from the function call
        }
        System.out.println("kartik " + n);// processing logic
        show(n - 1);// small problem +recursion (cycle)
        System.out.println("Gupta " + n);
    }

    public static void main(String[] args) {
        show(5);
    }
}

