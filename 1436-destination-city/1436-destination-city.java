class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet();
        
        for(int i = 0; i < paths.size(); i++) {
            set.add(paths.get(i).get(0));
        }
        
        for(int i = 0; i < paths.size(); i++) {
            String dest = paths.get(i).get(1);
            if(!set.contains(dest)) {
                return dest;
            }
        }
        return "";
    }
}