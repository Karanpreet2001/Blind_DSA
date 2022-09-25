package Array;
import java.util.Arrays;
import java.util.HashMap;

//Given an integer array nums, return true if 
//any value appears at least twice in the array, and return 
//false if every element is distinct.


// Input: nums = [1,2,3,1]
// Output: true

public class ContainDuplicate {
    

    public static void main(String[] args) {
        
        int[] nums = new int[]{1,2,3, 1};
        System.out.println(duplicatesThereUsingHash(nums)); 
    }


    // Time Complexity = O(n^2)
    private static boolean duplicatesThere(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
                
            }
        }

        return false;
    }


    // Using sorting
    // Time Complexity = O(nlogn)
    private static boolean duplicatesThereUsingSorting(int[] nums) {

        if(nums == null ||
            nums.length == 0){
                return false;
            }

            Arrays.sort(nums);


        for (int i = 1; i < nums.length; i++) {
            if(nums[i]== nums[i-1]){
                return true;
            }
        }

        return false;
    }

        // HashMap
      // Time Complexity = O(n)
    private static boolean duplicatesThereUsingHash(int[] nums) {


        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i], i);

        }

        return false;
    }
}
