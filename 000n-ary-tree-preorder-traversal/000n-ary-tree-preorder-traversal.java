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
    public List<Integer> preorder(Node root) {
        if(root !=null) {
            List<Integer> result = new ArrayList<Integer>();
            recursive(root, result);
            return result;
        }else{
            return new ArrayList<>();
        }
    }
   
    public void recursive(Node root, List<Integer> result) {
        if(root !=null){
            result.add(root.val);
            for(Node n: root.children) {
                recursive(n, result);
            }
        }
    }
    
}