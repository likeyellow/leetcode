class Solution {
    public boolean check(String s, int l, int r) {
        while(l < r) {
            if(s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;
        
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return (check(s, left, right - 1) || check(s, left+1, right));
            }
            left++;
            right--;
        }
        return true;
    }
}