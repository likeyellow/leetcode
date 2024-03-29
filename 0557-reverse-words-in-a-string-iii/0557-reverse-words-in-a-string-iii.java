class Solution {
    public String reverseWords(String s) {
        char[] words = s.toCharArray();
        int right = -1;
        
        for(int i = 0; i <= s.length(); i++) {
            if(i == s.length() || words[i] == ' ') {
                int left = right + 1;
                int end = i - 1;
                
                while(left < end) {
                    char tmp = words[left];
                    words[left] = words[end];
                    words[end] = tmp;
                    left++;
                    end--;
                }
                right = i;
            }
        }
        return new String(words);
    }
}