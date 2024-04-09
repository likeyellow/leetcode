class Solution {
    public boolean check(int i, int j, String s) {
        int left = i;
        int right = j -1;
        
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        
        for(int end = s.length(); end > 0; end--) {
            for(int start = 0; start <= s.length() - end; start++) {
                if(check(start, start + end, s)) {
                    return s.substring(start, start + end);
                }
            }
        }
        return "";
    }
}