class Solution {
    public boolean isPalindrome(String s) {

        List<Character> list = new LinkedList<>();
        
        for(int i = 0; i < s.length(); i++) {
            int ch = (int)s.charAt(i);
            if(65 <= ch && ch <= 90 ) {
                list.add((char)(ch + 32));
            } else if(97 <= ch && ch <= 122) {
                list.add((char)ch);
            } else if(Character.isDigit((char)ch)) {
                list.add((char)ch); 
            } else {
                continue;
            }
        }
        
        boolean result = true;
        for(int start = 0, end = list.size() -1; start < end; start++, end--) {
            if(list.get(start) != list.get(end)) {
                return result = false;
            }
        }
        return result;
    }
}