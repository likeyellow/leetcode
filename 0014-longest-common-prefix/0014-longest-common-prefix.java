class Solution {
    public String longestCommonPrefix(String[] strs) {
        String firstStr = strs[0];
        StringBuilder sb = new StringBuilder();
        
        if(strs[0].length() == 0) {
            return "";
        }
        if(strs.length == 1) {
            return strs[0];
        }
        
        for(int i = 0; i < strs[0].length(); i++) {
            
            char nowWord = strs[0].charAt(i);
        
            for(int j = 1; j < strs.length; j++) {
                if(i > strs[j].length() -1 || nowWord != strs[j].charAt(i)) {
                    return sb.append("").toString();                
                }
            }
            sb.append(nowWord);
        }
        return sb.toString();
    }
}