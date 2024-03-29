class Solution {
    public String reverseWords(String s) {
        char[] words = s.toCharArray();
        int spaceIdx = -1; // 마지막으로 찾은 공백의 인덱스를 저장하는 변수 초기화
        
        for(int now = 0; now <= s.length(); now++) {
            if(now == s.length() || words[now] == ' ') {
                int start = spaceIdx + 1;
                int end = now - 1;
                
                while(start < end) {
                    char tmp = words[start];
                    words[start] = words[end];
                    words[end] = tmp;
                    start++;
                    end--;
                }
                spaceIdx = now;
            }
        }
        return new String(words);
    }
}