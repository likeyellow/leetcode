class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /* 
        int mergeSortArr = new int[m+n];
        int tmpArr = new int[nums1.length + nums2.length];
        
        tmpArr = nums1.clone();
        System.arraycopy(nums2, 0, tmpArr, nums1.length -1, nums1.length);
        
        for(int i = 0; i < tmpArr.length; i++) {
            if()
        }
        */
        
        int p1 = m-1 , p2 = n-1 ,i = m+n-1;  // 각 배열의 가장 마지막 인덱스
        while(p2 >=0 ){
            if(p1 >=0 && nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];
            } 
            else{
                nums1[i--] = nums2[p2--];
            }
        }
    }
}