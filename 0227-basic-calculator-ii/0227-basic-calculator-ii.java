class Solution {
    public int calculate(String s) {
        int ans = 0;
        int nowNum = 0, lastNum = 0;
        char oper = '+';
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(Character.isDigit(ch)) {
                nowNum = nowNum * 10 + (ch - '0');
            }
            if(!Character.isDigit(ch) && !Character.isWhitespace(ch) || i == s.length() -1) {
                if(oper == '+') {
                    lastNum = nowNum;
                    ans += lastNum;
                } else if(oper == '-') {
                    lastNum = -nowNum;
                    ans += lastNum;
                } else if (oper == '*') {
                    ans -= lastNum;
                    lastNum *= nowNum;
                    ans += lastNum;
                } else if (oper == '/') {
                    ans -= lastNum;
                    lastNum /= nowNum;
                    ans += lastNum;
                } 
                oper = ch;
                nowNum = 0;
            }
        }
        return ans;
    }
}