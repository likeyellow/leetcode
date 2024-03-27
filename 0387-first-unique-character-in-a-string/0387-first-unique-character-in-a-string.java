class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);            
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        Set<Integer> set = new HashSet<>(map.values());
        for(int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}