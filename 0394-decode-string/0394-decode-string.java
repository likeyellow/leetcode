class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch == ']') {
                List<Character> decodeList = new ArrayList<>();
                
                while(stack.peek() != '[') {
                    decodeList.add(stack.pop());
                }
                // pop [ from the stack
                stack.pop();
                
                int base = 1;
                int k = 0;
                // get the number k
                while(!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    k = k + (stack.pop() - '0') * base;
                    base *= 10;                    
                }
                
                // pushing k times into stack
                while(k != 0) {
                    for(int j = decodeList.size() - 1; j >= 0; j--) {
                        stack.push(decodeList.get(j));
                    }
                    k--;
                }
            } else { // push the current character to stack
                stack.push(s.charAt(i));
            }
        }
        // get the result from stack
        char[] result = new char[stack.size()];
        for(int i = result.length -1; i>= 0; i--) {
            result[i] = stack.pop();
        }
        return new String(result);

    }
}