class Solution {
    public int removeElement(int[] nums, int val) { 
        int length = nums.length;
        int searchIdx = 0;
        int saveIdx = 0;
        
        while (searchIdx < length) {
            if(nums[searchIdx] == val) {
                searchIdx++;             
            } else {
                nums[saveIdx] = nums[searchIdx];
                searchIdx++;
                saveIdx++;
            }
        }
        
        return saveIdx;
    }
}