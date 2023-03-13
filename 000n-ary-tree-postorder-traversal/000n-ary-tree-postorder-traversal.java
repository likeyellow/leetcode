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
    public List<Integer> postorder(Node root) {
        if(root == null){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        recursive(root, result);
        
        return result;
    }
    
    public void recursive(Node root, ArrayList<Integer> result) {
       if(root != null){
           for(Node n: root.children) {
               recursive(n, result);
           }  
       }
       result.add(root.val);
    }
}