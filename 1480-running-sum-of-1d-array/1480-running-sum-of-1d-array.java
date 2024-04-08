class Solution {
    public int[] runningSum(int[] nums) {
        int[] preSum = new int[nums.length];
        
        preSum[0] = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            preSum[i] = preSum[i-1] + nums[i];
        }
        return preSum;
    }
}