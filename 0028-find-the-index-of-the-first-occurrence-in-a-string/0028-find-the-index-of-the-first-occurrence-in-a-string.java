class Solution {
    private int startIndex = 0;
    private int findIndex;
    
    public int strStr(String haystack, String needle) {
        while(true) {
            findIndex = haystack.indexOf(needle, startIndex);
            if(findIndex < 0)
                break;
            startIndex = findIndex + needle.length();
            break;
        }
        return findIndex;
    }
}