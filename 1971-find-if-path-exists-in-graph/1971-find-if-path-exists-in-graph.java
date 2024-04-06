class Solution {   
    int[] parent;
    int[] depth;
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        parent = new int[n];
        depth = new int[n];
        
        for(int i = 0; i < n; i++) {
            parent[i] = i;
            depth[i] = 1;
        }
        
        for(int[] edge : edges) {
            int px = find(edge[0]);
            int py = find(edge[1]);
            
            if(px != py)
                union(px, py);
        }
        
        return find(source) == find(destination);
    }
    
    private int find(int x) {
        if(x == parent[x])
            return x;
        parent[x] = find(parent[x]);
        return parent[x];
    }
    
    private void union(int px, int py) {
        if(depth[py] > depth[px]) {
            depth[py] += depth[px];
            parent[px] = py;
        } else {
            depth[px] += depth[py];
            parent[py] = px;
        }
    }
}