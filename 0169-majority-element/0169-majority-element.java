class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        
        Map<Integer, Integer> map = new HashMap<>();
        int mid = nums.length/2 + 1;
        
        
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            
            if(map.get(nums[i]) == mid) return nums[i];
        }        
        
        return -1;
    }
}