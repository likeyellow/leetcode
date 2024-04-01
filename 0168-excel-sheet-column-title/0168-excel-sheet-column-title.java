class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        char ch = 'A';
        
        while(columnNumber > 0) {
            columnNumber--;
            sb.append((char)(ch + columnNumber % 26));
            columnNumber = (columnNumber) / 26;
        }
        
        return sb.reverse().toString();
    }
}