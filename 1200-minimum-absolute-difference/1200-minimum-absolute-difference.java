class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        /*
        int max = 0;
        for(int x : arr) {
            max = Math.max(x, max);
        }
        
        // count
        int[] counts = new int[max + 1];
        for(int x : arr) {
            counts[x]++;
        }
        
        // sum
        for(int i = 0; i < max; i++) {
            counts[i + 1] += counts[i];
        }
        
        int[] result = new int[arr.length];
        for(int i = arr.length -1; i >= 0; i--) {
            counts[arr[i]]--;
            result[counts[arr[i]]] = arr[i];
        } // 카운팅 정렬응용해서 풀것도 아니면서 왜 구현한거징 -_-;;
        //System.out.print(Arrays.toString(result));
        카운팅 정렬을 이렇게 구현하면 음수가 있는 배열의 요소를
        카운팅 할때 에러남 ㅜㅡ
        */
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList();
        int minDiff = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length-1; i++) {
            minDiff = Math.min(minDiff, arr[i + 1] - arr[i]);
        }

        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i+ 1] - arr[i] == minDiff) {
                ans.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return ans;
    }
}