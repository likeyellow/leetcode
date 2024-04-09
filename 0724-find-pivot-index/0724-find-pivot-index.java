class Solution {
    public int pivotIndex(int[] nums) {
        /*
        int sumLeft = 0;
        int sumRight = 0;
                
        int i = 0;
        int j = nums.length - 1;
        
        int res = 0;
        while(i < j) {
            sumLeft += nums[i];
            sumRight += nums[j];
            
            if(sumLeft == sumRight) {
                i++;
                j--;
                sumLeft += nums[i];
                sumRight += nums[j];
            } else if(sumLeft < sumRight) {
                i++;
                sumLeft += nums[i];
            } else {
                j--;
                sumRight += nums[j];
                if(sumRight == 0) {
                    return 0;
                }
            }            
        }
        if(sumLeft == sumRight) {
            return i;
        } else {
            return -1;
        }
        */
        int sum = 0, leftSum = 0;
        for(int i : nums) {
            sum += i;
        }
        for(int i = 0; i < nums.length; ++i) {
            if(leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}