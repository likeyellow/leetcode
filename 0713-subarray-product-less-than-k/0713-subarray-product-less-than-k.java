class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int cnt = 0;
        int total = 1;
        int left = 0;
        int right = 0;
        
        if(k <= 1) return 0; // [1, 1, 1], k=1 일때 방지
        
        while(right < nums.length) {

            total *= nums[right];
            while(total >= k) {
                total /= nums[left++];
            }             

            cnt += right - left + 1;
            right++;
        }
        return cnt;        
    }
}