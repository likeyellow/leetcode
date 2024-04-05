class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] count = new int[101];
        int result = 0;
        int max = 0;
        
        for(int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        
        for(int i = 0; i < count.length; i++) {
            if(count[i] > max) {
                max = count[i];
                result = count[i];
            } else if(count[i] == max) {
                result += count[i];
            }
        }
        return result;

    }
}