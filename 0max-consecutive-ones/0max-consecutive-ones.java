class Solution {
    public int findMaxConsecutiveOnes(int[] nums) { // 연속된 1의 최대개수는 몇개인지 출력
        
        int count = 0;
        int maxCount = 0; 
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count ++;
                maxCount = Math.max(maxCount, count);
                
            }else if(nums[i] == 0) {
                count = 0;
            }
        }
        
        return maxCount;
    }
}