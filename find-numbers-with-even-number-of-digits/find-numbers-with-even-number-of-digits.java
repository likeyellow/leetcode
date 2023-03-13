class Solution {
    
    public int findNumbers(int[] nums) {   
        int digitCount = 0; 
        int resultCount = 0;
        for(int i=0; i < nums.length; i++){
            while( nums[i] >= 1 ) {
                nums[i] = nums[i] / 10;
                digitCount++;                
            }
            if(digitCount % 2 == 0) {
                resultCount++;
            }
            digitCount = 0;
        }
        return resultCount; 
    }
}