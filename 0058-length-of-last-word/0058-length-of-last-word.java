class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s", 0); // 마지막 공백도 제거하는 옵션(, 0)으로 split하기
        
        String lastWord = words[words.length - 1]; // 마지막 문자 가져오기
        
        return lastWord.length();

        
    }
}