class Solution {
    public void moveZeroes(int[] nums) {
        int find = 0;
        
        for(int i = 0; i < nums.length; i++) { 
            if(nums[i] != 0) {
                nums[find] = nums[i];
                find++;
            }
        }
        for(;find<nums.length; find++) {
            nums[find] = 0;
        }
    }
}