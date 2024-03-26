class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        
        if(ss.length != tt.length) return false;
        
        int[] counter = new int[26];
        for(int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }        
        for(int n: counter) {
            if(n != 0) return false;
        }
        return true;
    }
}