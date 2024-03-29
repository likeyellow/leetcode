class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        
        int curr = -1;
        int i = 0;
        int j = 0;
        
        while(i < word.length() && j < abbr.length()) {
            
            if(word.charAt(i) == abbr.charAt(j)) {
                i++;
                j++;
                continue;
            }
            // abbr의 숫자가 0 으로 시작할 때 
            if(abbr.charAt(j) == '0' || !Character.isDigit(abbr.charAt(j))) {
                return false;
            }
            
            // abbr의 숫자가 2자리 이상이거나 1 <= x <= 9로 정상적인 한자리 숫자일때
            int num = 0;
            while(j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                num = 10 * num + (abbr.charAt(j) - '0');
                j++;
            }
            i += num;
        }
        return i == word.length() && j == abbr.length();
    }
}