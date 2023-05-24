class Solution {
    
    public void sortColors(int[] nums) {   // 선택정렬로 오름차순 정렬
        for(int i=0; i< nums.length; i++){
            
    // step 1: 오름차순이므로 전체 배열에서 최솟값을 찾아서 가장 작은 값 인덱스로 지정함
            int minIndex = i; 
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;   
                }
            }
            
    // step 2: 가장 작은 값 인덱스와 전체 배열 중 가장 첫번째부터 차례대로 비교하여 이제 swap 진행하여 오름차순 정렬
                int tmp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = tmp;
        }
    }
}