class Solution {
    public String build(String S) {
        Stack<Character> stack = new Stack();

        for(char c : S.toCharArray()) {            
            if(c != '#') {
                stack.push(c);
            } else if(!stack.empty()) {
                stack.pop();
            }            
        }
        return String.valueOf(stack);
    }
    
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

}