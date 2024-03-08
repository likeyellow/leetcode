class Solution {

    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        
        list.add(new ArrayList<>());
        list.get(0).add(1);  
        
        if(numRows == 1) return list;            
        
        list.add(new ArrayList<>());
        list.get(1).add(1);
        list.get(1).add(1);
        
        
        if(numRows == 2) return list; 
        
        for(int i = 3; i <= numRows; i++) {
            list.add(new ArrayList<>());
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) list.get(i - 1).add(1);
                else {
                    list.get(i - 1).add(list.get(i - 2).get(j - 1) + list.get(i - 2).get(j - 2));
                }
            }
        }
            
            
        return list;
    }
}