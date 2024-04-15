class Solution {
    public int calculate(String s) {
        /*
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
        */
        if(s == null || s.isEmpty()) return 0;
        
        Stack<Integer> stack = new Stack<>();
        int lastNum = 0;
        char oper = '+';
        for(int i = 0; i < s.length(); i++) {
            char lastChar = s.charAt(i);
            if(Character.isDigit(lastChar)) {
                lastNum = lastNum * 10 + (lastChar - '0');
            }
            if(!Character.isDigit(lastChar) && !Character.isWhitespace(lastChar) || i == s.length() -1) {
                if(oper == '-') {
                    stack.push(-lastNum);
                } else if(oper == '+') {
                    stack.push(lastNum);
                } else if(oper == '*') {
                    stack.push(stack.pop() * lastNum);
                } else if(oper == '/') {
                    stack.push(stack.pop() / lastNum);
                }
                oper = lastChar;
                lastNum = 0;
            }
        }
        int ans = 0;
        while(!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }
}