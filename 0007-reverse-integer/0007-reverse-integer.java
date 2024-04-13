class Solution {
    public int reverse(int x) {
        int ans = 0;
        
        boolean isMin = false;
        StringBuilder sb = new StringBuilder();
        String numberAsString = Integer.toString(x);
        for(char ch : numberAsString.toCharArray()) {
            if(ch == '-') {
                isMin = true;
                continue;
            }
            sb.append(ch);
        }
        sb.reverse();
        
        if(isMin) {
            sb.insert(0, '-');
        }
        try {
            ans = Integer.parseInt(sb.toString());
        } catch(NumberFormatException e) {
            return 0;
        }
        return ans;
    }
}