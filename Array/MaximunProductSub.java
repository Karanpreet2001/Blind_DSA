public class MaximunProductSub {
    

    public static void main(String[] args) {
        
        int[] nums = {2, 3, -2, 4};
        System.out.println(maxSubArray(nums)+"");
    }


    // Time complex - O(N)
    private static int maxSubArray(int[] nums) {

        int ans = nums[0], minSoFar = nums[0], maxSoFar= nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < 0){
               int temp = minSoFar;
               minSoFar = maxSoFar;
               maxSoFar= temp;
            }

            maxSoFar = Math.max(nums[i], nums[i]*maxSoFar);
            minSoFar = Math.min(nums[i], nums[i]*minSoFar);
            ans = Math.max(maxSoFar, ans);
        }
        return ans;
    }
}
