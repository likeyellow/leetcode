/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    private ListNode front;
    
    private boolean recur(ListNode currentNode) {
        if(currentNode != null) {
            if(!recur(currentNode.next)) return false;
            if(currentNode.val != front.val) return false;
            front = front.next;
        }
        return true;
    }
    
    
    public boolean isPalindrome(ListNode head) {
        front = head;
        return recur(head);
    }
}