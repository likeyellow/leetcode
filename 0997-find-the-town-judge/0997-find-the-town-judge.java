class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length < n-1) {
            return -1;
        }
        
        int[] indegree = new int[n+1]; // index를 1부터 시작하기 위해
        int[] outdegree = new int[n+1];
        
        for(int[] relation : trust) {
            outdegree[relation[0]]++;
            indegree[relation[1]]++;
        }
        for(int i = 1; i <= n; i++) {
            if(indegree[i] == n-1 && outdegree[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}