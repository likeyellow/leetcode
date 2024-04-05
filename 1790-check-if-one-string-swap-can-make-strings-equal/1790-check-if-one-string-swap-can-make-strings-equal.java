class Solution {
    public int[] countString(String s) {
        int[] count = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        return count;
    }
    
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        
        int[] c1 = countString(s1);
        int[] c2 = countString(s2);
        
        for(int i = 0; i < c1.length; i++) {
            if(c1[i] != c2[i]) return false; 
        }
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) count++;
            if(count > 2) return false;
        }
        return true;
    }
}