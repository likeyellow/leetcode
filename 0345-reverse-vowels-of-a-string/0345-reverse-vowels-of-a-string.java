class Solution {
    boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() -1;
        
        char[] arr = s.toCharArray();
        
        while(left < right) {
            if(!isVowel(s.charAt(left))) {
                left++;
            }
            
            if(!isVowel(s.charAt(right))) {
                right--;
            }
            
            if(isVowel(s.charAt(left)) && isVowel(s.charAt(right))) {
                char tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}