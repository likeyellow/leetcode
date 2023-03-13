/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null) {
            return new ArrayList<List<Integer>>();
        }
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        recursive(root, result, 0);
        
        return result;
    }
    
    public void recursive(Node root, ArrayList<List<Integer>> result, int level){
        if(root != null) {
            if(result.size() == level){
                result.add(new ArrayList<>());
            }
            result.get(level).add(root.val);
            for(Node n : root.children) {
                recursive(n, result, level+1);
            }
        }
    }
}