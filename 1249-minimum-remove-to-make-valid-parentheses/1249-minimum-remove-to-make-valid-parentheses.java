class Solution {
    public String minRemoveToMakeValid(String s) {
        /*
        // 1. 유효하지 않은 ) 제거
        StringBuilder sb = new StringBuilder();
        int openCnt = 0;
        int pairCnt = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                openCnt++;
                pairCnt++;
            } 
            if(ch == ')') {
                if(pairCnt == 0) continue;
                pairCnt--;
            }
            sb.append(ch);
        }
        // 2. 남아있는 가장 오른쪽의 짝이 없는 ( 제거
        StringBuilder result = new StringBuilder();
        int openKeep = openCnt - pairCnt;
        for(int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if(ch == '(') {
                openKeep--;
                if(openKeep < 0) continue;
            }
            result.append(ch);
        }
        return result.toString();
        */
        Set<Integer> idxToRemove = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(i);
            }
            if(s.charAt(i) == ')') {
                if(stack.isEmpty()) {
                    idxToRemove.add(i);
                } else {
                    stack.pop();
                }
            }
        }
        // 스택에 모은 제거할 인덱스를 셋에 넣음
        while(!stack.isEmpty()) idxToRemove.add(stack.pop());
        
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(!idxToRemove.contains(i)) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}