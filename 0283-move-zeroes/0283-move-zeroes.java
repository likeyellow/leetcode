class Solution {
    public void moveZeroes(int[] nums) {
        /*
        int find = 0;
        
        for(int i = 0; i < nums.length; i++) { 
            if(nums[i] != 0) {
                nums[find] = nums[i];
                find++;
            }
        }
        for(int j = find; j < nums.length; j++) {
            nums[j] = 0;
        }
        */
        int j = -1;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0 && j == -1) { // 배열 처음이 0일 경우 처리
                j = i;
            } else if(nums[i] != 0 && j != -1) {
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            }
        }
    }
}