class Solution {
    public boolean isPalindrome(int x) {
        int originalNum = x;

        if(originalNum < 0) 
            return false;

        int result = 0;
        while(originalNum != 0) {
            result = result * 10 + originalNum % 10;
            originalNum = originalNum / 10;
        } 
        
        if(result == x) {
            return true;
        } else {
            return false;
        }
    }
}