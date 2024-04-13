class Solution {
    public int calculate(String s) {
        int ans = 0;
        int lastNum = 0, totalNum = 0;
        char oper = '+';
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(Character.isDigit(ch)) {
                lastNum = lastNum * 10 + (ch - '0');
            }
            if(!Character.isDigit(ch) && !Character.isWhitespace(ch) || i == s.length() -1) {
                if(oper == '+') {
                    totalNum = lastNum;
                    ans += totalNum;
                } else if(oper == '-') {
                    totalNum = -lastNum;
                    ans += totalNum;
                } else if (oper == '*') {
                    ans -= totalNum;
                    totalNum *= lastNum;
                    ans += totalNum;
                } else if (oper == '/') {
                    ans -= totalNum;
                    totalNum /= lastNum;
                    ans += totalNum;
                } 
                oper = ch;
                lastNum = 0;
            }
        }
        return ans;
    }
}