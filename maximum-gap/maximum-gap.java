class Solution {
    static void heapSort(int[] arr, int n) {
        heapify(arr, n);
        
        for(int i = n-1; i >= 0; i--) {
            swap(arr, 0, i);
            
            heapify(arr, i);
        }
    }
    static void heapify(int[] arr, int last) {
        for(int i = 1; i < last; i++) {
            int child = i;
            
            while(child > 0) {
                int parent = (child - 1) / 2;
                
                if(arr[child] > arr[parent]) {
                    swap(arr, child, parent);
                }
                child = parent;
            }
        }
    }
    static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }
    public int maximumGap(int[] nums) {
        
        if(nums.length == 1) return 0;
        
        /*
        for(int i = 0; i < nums.length; i++) {
            for(int j = nums.length -1; j > i; j--) {
                if(nums[j-1] > nums[j]) {
                    int tmp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }  
        버블 정렬 O(n^2)로 정렬 했더니 시간초과가 나옴 ㅜㅜ
        힙 정렬로 정렬해도 시간초과가 나옴 ㅜㅜ
        heapSort(nums, nums.length); 
        */
        
        Arrays.sort(nums);
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] - nums[i-1] > max) {
                max = nums[i] - nums[i-1];
            }
        }
        return max;        
    }
}