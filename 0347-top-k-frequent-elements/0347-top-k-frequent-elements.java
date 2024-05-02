class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length) {
            return nums;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
       /* 
        List<Integer> valueList = new ArrayList<>(map.values());
        valueList.sort((s1, s2) -> s1.compareTo(s2));
        System.out.print(valueList);


        for(int num : map.keySet()) {
            //Iterator<Integer> iter = valueList.iterator();
            for(int i = 0; i < valueList.size(); i++) {
                //int value = (int)iter.next();
                //int v = valueList.get(i);
                if(valueList.size() >= k+1) {
                    valueList.remove(i);
                }
            }
        }
        System.out.print(valueList);

  
        int[] ans = new int[k];      
        for(int i = 0; i < k; i++) {
            ans[i] = valueList.get(i);
        }
        return ans;
        */
        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));   
        System.out.print(heap);
        
        for(int key : map.keySet()) {
            heap.add(key);
            if(heap.size() > k) heap.poll();            
        }
        int[] ans = new int[k];
        for(int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }
        return ans;
    }
}