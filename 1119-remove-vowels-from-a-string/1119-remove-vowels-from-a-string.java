class Solution {
    public String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch == 'a' ||
              ch == 'e' ||
              ch == 'i' ||
              ch == 'o' ||
              ch == 'u') {
                continue;
            } 
            sb.append(ch);
        }
        return sb.toString();
    }
}