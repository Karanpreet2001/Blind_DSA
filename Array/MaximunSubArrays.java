package Array;


//Given an integer array nums, find the 
//contiguous subarray (containing at least one number) which has 
//the largest sum and return its sum.


// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: [4,-1,2,1] has the largest sum = 6.



public class MaximunSubArrays {

    public static void main(String[] args) {
     
        int[] nums = { -5, 4, 6, -3, 4, -1};
        int sum = maxSubArrays( nums);
        System.out.println(sum+"");
    }


    // Brute Force, Time Complexity =O(N^2)
    private static int maxSubArrays(int[] nums) {
        
        int maxSum=-1;
        for (int i = 0; i < nums.length; i++) {
            int sum =0;
            for (int j = i; j < nums.length; j++) {
                sum = sum +nums[j];
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    // Kadane's aldgorithm - O(n)
    private static int maxSubArraysUsingAlgo(int[] nums) {
        
        int maxSum= 0;
        int currSum= 0;

        for (int i = 0; i < nums.length; i++) {
            currSum = currSum+nums[i];

            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum > 0){
                currSum = 0;
            }
        }
        return maxSum;

    }

    
}
