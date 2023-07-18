class Solution {
    public void duplicateZeros(int[] arr) {   
        // int length = arr.length -1;
        
        // for(int i = 0; i < length; i++) {
            
        //     if(arr[i] == 0) {  
        //         System.out.println("=========");
        //         System.out.println(i);
        //         System.out.println("=========");
                
        //         for(int j = length; j >= i ; j--) {
        //             arr[j] = arr[j-1];
        //             System.out.println(Arrays.toString(arr));;                    
        //         }
        //     }
        // }

        // 결국 답지를 볾 ㅜㅜ 0인 인덱스 ~ 마지막 인덱스까지 오른쪽으로 옮겨지는 게
        // 아니라... 다시 한번 또 돌아서 비교함..? 왜 그런건지 ㅠㅠ
        if(arr == null || arr.length == 0) return; // 없어도 될듯..?

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                for(int j = arr.length -1; j > i; j--) {
                    arr[j] = arr[j-1];
                }
                i++; // we don't want to traverse over the duplicate zero
            }
        }
    }
}