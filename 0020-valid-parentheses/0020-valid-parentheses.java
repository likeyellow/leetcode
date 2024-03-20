class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        
        if(s.length() <= 1) {
            return false;
        }    
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if(st.isEmpty()) { //   }[] 이렇게 들어오는 경우 } 에 대한 예이므로 false 
                    return false;
                }
                if(st.peek() == '(' && ch == ')') {
                    st.pop();
                } else if(st.peek() == '[' && ch == ']') {
                    st.pop();
                } else if(st.peek() == '{' && ch == '}') {
                    st.pop();
                } else return false;
            }
        }
        return st.isEmpty();
    }     
}