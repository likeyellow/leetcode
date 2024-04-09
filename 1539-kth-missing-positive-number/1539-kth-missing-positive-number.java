class Solution {
    public int findKthPositive(int[] arr, int k) {
        if(k < arr[0]) return k;
        /*
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 1; i < 1001; i++) {
            map.put(i, 0);
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
        }
        
        int result = 0;
        int order = 1;
        for(int key : map.keySet()) {
            if(map.get(key) == 1) {
                continue;
            }
            
            if(order == k) {
                return result = key;
            }
            order++;
            
        }
        return arr[arr.length-1] + k - order;
        */
        Set<Integer> set = new HashSet();
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        

        List<Integer> notFound = new ArrayList<>();
        for(int i = 1; i <= arr[arr.length-1]; i++) {
            if(!set.contains(i)) {
                notFound.add(i);
            }
        }
        if(!notFound.isEmpty() && notFound.size() >= k) {
            return notFound.get(k-1);
        }
        return arr[arr.length-1] + k - (notFound.size());
    }
}