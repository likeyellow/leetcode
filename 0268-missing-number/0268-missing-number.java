class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int res = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == start) {
                start++;
            } 
            res = start;
        
        }
        return res;
    }
}