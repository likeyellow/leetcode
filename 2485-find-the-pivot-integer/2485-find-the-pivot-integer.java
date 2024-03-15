class Solution {
    public int pivotInteger(int n) {
        int[] preSum = new int[n+1];
        
        for(int i = 1; i <= n; i++) {
            preSum[i] = preSum[i-1] + i;
        }
        
        if(n <= 1) return n;
        
        for(int i = n/2; i < n-1; i++) {
            int sum1 = preSum[i-1];
            int sum2 = preSum[n] - preSum[i];
            
            if(sum1 == sum2) {
                return i;
            } 
        }
        return -1;
    }
}