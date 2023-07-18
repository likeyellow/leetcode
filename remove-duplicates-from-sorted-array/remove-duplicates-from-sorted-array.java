class Solution {
    public int removeDuplicates(int[] nums) {
        
        // int startPoint = 0;
        // int endPoint = 1;
        // int count = 0;
        // int resultLen = 0;
        
        // while(startPoint < nums.length -1) {
        //     //for(int i = 0; i < nums.length; i++) { // 0,1,2, .....
        //     if(nums[startPoint] < nums[endPoint]) {
        //         startPoint++;
        //         endPoint++;    
        //     } else if(nums[startPoint] == nums[endPoint]) {
        //         endPoint++;
        //         count++;
        //         resultLen = resultLen - count;
        //         System.out.println("음..." + resultLen);
        //     } else if(startPoint == nums.length -1) {
        //         break;
        //     }
        // }     
        // return resultLen;

        int finder = 1;
        for(int i=1; i< nums.length; i++) {
            if(nums[i-1] != nums[i]) {
                nums[finder] = nums[i];
                finder++;
            }
        }
        return finder;
    }
}