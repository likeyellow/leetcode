class Solution {
    public int[] plusOne(int[] digits) {
        
        int lastIdx = digits.length -1;
        
        for(int i = lastIdx; i >= 0; i--) {
            if(digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        
        digits = new int[digits.length +1];
        digits[0] = 1;
        return digits;

    }
}