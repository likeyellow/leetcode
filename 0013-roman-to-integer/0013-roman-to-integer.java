class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        
        int result = 0;
        int pastPick = 0;
        for(int i = s.length()-1; i >= 0; i--) {
            char pickChar = s.charAt(i);
            int pickDigit = roman.get(pickChar);
            
            if(pastPick > pickDigit) { 
                result -= pickDigit;
   
            } else {
                result += pickDigit;
            }
            pastPick = pickDigit;
        }
        return result;
    }
}