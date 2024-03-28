class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        
        int len = word1.length() + word2.length();
        
        int start1 = 0;
        int start2 = 0;
        
        while(start1 < word1.length() && start2 < word2.length()) {
            char ch1 = word1.charAt(start1);
            char ch2 = word2.charAt(start2);
            sb.append(ch1);
            start1++;
            sb.append(ch2);
            start2++;
        }
        if(word1.length() < word2.length()) {
            sb.append(word2.substring(start2));
        } else if(word1.length() > word2.length()) {
            sb.append(word1.substring(start1));
        }  
        return sb.toString();
    }
}