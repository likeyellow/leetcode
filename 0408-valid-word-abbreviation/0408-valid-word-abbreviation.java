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
            if(abbr.charAt(j) == '0' || !Character.isDigit(abbr.charAt(j))) {
                return false;
            }
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