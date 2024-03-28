class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int n : nums1) {
            set1.add(n);
        }
        for(int m : nums2) {
            set2.add(m);
        }
        
        set1.retainAll(set2);   
        int[] result = new int[set1.size()];
        int idx = 0;
        for(int s: set1) {
            result[idx++] = s;
        }
        
        return result;
    }
}