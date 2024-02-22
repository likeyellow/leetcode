class Solution {
    private int findIndex = 0;
    private boolean isMatch;

    public int strStr(String haystack, String needle) {
        for(int i = 0; i < haystack.length(); i++) {
            isMatch = true;
            findIndex = i;
            for(int j = 0; j < needle.length(); j++) {
                if(i + j >= haystack.length() || haystack.charAt(i + j) != needle.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }
            if(isMatch) {
                findIndex = i;
                i += needle.length() - 1;
                break;
            }
        }
        return isMatch? findIndex : -1; 
    }
}