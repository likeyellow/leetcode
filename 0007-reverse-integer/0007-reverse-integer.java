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
        
        /*
                int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
        */
    }
}