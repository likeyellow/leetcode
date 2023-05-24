class Solution {
    public int heightChecker(int[] heights) {            
        
        int [] heightsCopy = new int[heights.length]; // 기존 배열을 새 배열에 복사       
        for(int i=0; i < heights.length; i++){
            heightsCopy[i] = heights[i];
        }
        
        // 기존 배열을 버블정렬로 오름차순 정렬함
        boolean swap = true; 
        while(swap) { 
            swap = false;  // 스왑여부 초기값 세팅
            
            for(int i = 0; i < heights.length -1; i++) {
                if(heights[i] > heights[i+1]) {
                    int tmp = heights[i+1];
                    heights[i+1] = heights[i];
                    heights[i] = tmp;
                    
                    swap = true;
                }
            }          
        }
        
        // 몇번 swap 됐는지 카운트하여 출력        
        int count = 0;
        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != heightsCopy[i]) {
                count++;
            }
        }

        
        return count; 
    }
}