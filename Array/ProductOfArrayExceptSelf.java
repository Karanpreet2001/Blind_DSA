package Array;



// Input: nums = [1,2,3,4]
//Output: [24,12,8,6]


public class ProductOfArrayExceptSelf {
    

    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4};
        int[] result = getArrayUsingConstSpace(nums);
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


    // Time Complexity - O(N) but Space complexity = O(N)
    private static int[] getArraySelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];

        int[] left_product = new int[len];
        int[] right_product = new int[len];

        left_product[0] = 1;
        right_product[len-1] =1;

        for (int i = 1; i < len; i++) {
            left_product[i] = left_product[i-1]*nums[i-1];
        }

        for (int i = len-2; i >= 0 ; i--) {
            right_product[i] = right_product[i+1]* nums[i+1];
        }

        for (int i = 0; i < len; i++) {
            result[i] = left_product[i]*right_product[i];
        }

        return result;

    }


    // Time Complexity - O(N)
    private static int[] getArrayUsingConstSpace(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];



        result[0] = 1;
       

        for (int i = 1; i < len; i++) {
            result[i] = result[i-1]*nums[i-1];
        }

        int R=1;
        for (int i = len-1; i >= 0 ; i--) {
            result[i] = result[i]* R;
            R = R * nums[i];
        }


        return result;

    }


    
}
