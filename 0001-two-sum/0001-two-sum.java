class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result = target - nums[i];
            if(map.containsKey(result)) {
                return new int[] {map.get(result), i};
            } 
            map.put(nums[i], i);
        }
        return null;
    }
}