class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //Map<Character, Integer> map1 = new HashMap<>();
        //Map<Character, Integer> map2 = new HashMap<>();
        
        
        StringBuilder sb1 = new StringBuilder();
        for(int i = 0; i < word1.length; i++) {
            sb1.append(word1[i]);
        }
        
        StringBuilder sb2 = new StringBuilder();
        for(int j = 0; j < word2.length; j++) {
            sb2.append(word2[j]);
        }
        
        boolean result = false;
        if((sb1.toString()).equals(sb2.toString())) {
            result = true;
        }
        return result;
    }    
}