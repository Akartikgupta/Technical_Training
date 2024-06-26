public class TwoSArray {
    public static void main(String[] args) {
        // Array within array
        // int[][] arr=new int[3][3];
        int[][] arr = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[10];
        // for(int i=0;i<arr.length;i++){
        // for(int j=0;j<arr.length;j++){
        // System.out.print(arr[i][j]+" ");;
        // }
        // System.out.println();
        // }
        for (int a[] : arr) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
