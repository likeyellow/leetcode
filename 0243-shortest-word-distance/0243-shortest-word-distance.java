class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        
        
        int dist = Integer.MAX_VALUE;
        int key1 = -1;
        int key2 = -1;
        for(int i = 0; i < wordsDict.length; i++) {
            if(wordsDict[i].equals(word1)) {
                key1 = i;
                
            } else if(wordsDict[i].equals(word2)) {
                key2 = i;
            }
            
            if(key1 != -1 && key2 != -1) {
                dist = Math.min(dist, Math.abs(key1 - key2));
            }
        }
        return dist;
    }
}