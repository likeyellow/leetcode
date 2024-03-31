class Solution {
    private int recur(int n) {
        
        int sum = 0;
        while(n > 0) {
            int d = n % 10;
            n = n / 10;
            sum += d * d;
        }
        return sum;
    }
    
    public boolean isHappy(int n) {
        Set<Integer> nums = new HashSet<>();
        
        while(n != 1 && !nums.contains(n)) {
            nums.add(n);
            n = recur(n);
        }
        
        return n == 1;
    }
    
}