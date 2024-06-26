import java.util.Arrays;
import java.util.HashMap;

// https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // use for value and index
        HashMap<Integer, Integer> map = new HashMap<>();
        int pair[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.get(result) != null) {
                pair[0] = map.get(result);
                pair[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return pair;
    }
    /*
     * int arr[]=new int[2];
     * int i=0;
     * int j=nums.length-1;
     * int sum=0;
     * int aux[]=Arrays.copyOf(nums,nums.length);
     * Arrays.sort(aux);
     * while(i<j){
     * sum=aux[i]+aux[j];
     * if(sum==target){
     * break;
     * }
     * else if(sum<target){
     * i++;
     * }else if(sum>target){
     * j--;
     * }
     * }
     * for(int k=0;k<nums.length;k++){
     * if(nums[k]==aux[i]){
     * arr[0]=k;
     * }
     * }
     * for(int k=nums.length-1;k>=0;k--){
     * if(nums[k]==aux[j]){
     * arr[1]=k;
     * }
     * }
     * return arr;
     */

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;
        int arr[] = twoSum(nums, target);
        System.out.println(Arrays.toString(arr));
    }
}
