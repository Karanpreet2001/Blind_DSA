package Array;

import java.util.HashMap;

// return indices of two number 
// such that they add up to target
public class Twosum{

    public static void main(String[] args) {
       
        var target = 6;
        int[] nums =  {3,2,4};
        
        int[] result = getTwoSumUsingMap(nums, target);
        System.out.println(result[0]+"   "+ result[1]+"");
    }


    // Time complexity - O(N^2)
    private static int[] getTwoSum(int[] nums, int target) {

        int numsLen= nums.length;

        for (int i = 0; i < numsLen; i++) {
            for (int j = i+1; j < numsLen; j++) {
                if(target - nums[j] == nums[i]){
                    int[] result = {i,j};
                    return result;
                }

            }
        }
        return nums;
    }

    // time complex - O(N)
    private static int[] getTwoSumUsingMap(int[] nums, int target) {

        int[] result = new int[2];
       HashMap<Integer, Integer> map = new HashMap<>();

       for (int i = 0; i < nums.length; i++) {
        
        if(map.containsKey(target-nums[i])){
            result[1]=i;
            result[0]=map.get(target-nums[i]);
            return result;
        }

        map.put(nums[i], i);
       }
       return nums;
    }



}