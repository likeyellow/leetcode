class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        int left = lower;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > left) list.add(Arrays.asList(left, nums[i] - 1));
            left = nums[i] + 1;
        }
        if(upper >= left) list.add(Arrays.asList(left, upper));
        
        return list;
    }
}