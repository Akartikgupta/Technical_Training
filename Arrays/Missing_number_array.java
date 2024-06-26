// https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
public class Missing_number_array {
    public static int missingNumber(int n, int arr[]) {
        int x = 0;
        int y = 0;
        for (int i = 1; i <= n; i++) {
            x = x ^ i;
        }
        for (int val : arr) {
            y = y ^ val;
        }
        return x ^ y;
        // int hash[]=new int[n+2];
        // for(int val:arr){
        // hash[val]=1;
        // }
        // for(int i=1;i<hash.length;i++){
        // if(hash[i]==0){
        // return i;
        // }
        // }
        // return 0;
        // int sum=n*(n+1)/2;
        // for(int val:arr){
        // sum=sum-val;
        // }
        // return sum;
        // Your Code Here
    }

    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 5 };
        System.out.println(missingNumber(5, ar));
    }
}
