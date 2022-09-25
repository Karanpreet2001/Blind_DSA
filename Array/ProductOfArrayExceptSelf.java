package Array;
//Given an integer array nums, return an array answer such that answer[i] is equal 
//to the product of all the elements of nums except nums[i].


// Input: nums = [1,2,3,4]
//Output: [24,12,8,6]


public class ProductOfArrayExceptSelf {
    

    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4};
        int[] result = getArray(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


    // brute force
    // time comp 
    private static int[] getArray(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            int product =1;
            for (int j = 0; j < len; j++) {
                if(i != j){
                    product *= nums[j];
                }
            }
            result[i] = product;
        }

        return result;
    }
}
