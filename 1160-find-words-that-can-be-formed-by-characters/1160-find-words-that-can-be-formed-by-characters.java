class Solution {
    public int countCharacters(String[] words, String chars) {
        /*
        int w = 0;
        int c = 0;
        int[] counter = new int[chars.length()];
        
        for(int i = 0; i < words.length; i++) {
            
            while(w < words[i].length) {
                if(words[i].charAt(w)) {
                    
                }
            }
            
        }
        */
        Map<Character, Integer> count = new HashMap<>();
        for(Character c : chars.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        int ans = 0;
        for(String word : words) {
            Map<Character, Integer> wordCount = new HashMap<>();
            for(Character c : word.toCharArray()) {
                wordCount.put(c, wordCount.getOrDefault(c, 0) + 1);
            }
            boolean result = true;
            for(Character c : wordCount.keySet()) {
                if(count.getOrDefault(c, 0) < wordCount.get(c)) {
                    result = false;
                    break;
                }                    
            }
            if(result) {
                ans += word.length();
            }
        }
        return ans;
    }
}