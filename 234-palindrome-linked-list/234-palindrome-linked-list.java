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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> list = new Stack<>();
        
        ListNode current = head;
        
        while(current != null) {    
            list.push(current.val);
            current = current.next;
        }
        
        current = head;
        
        while(!list.empty()) {
            if(current.val != list.pop()) {
                return false;
            }
            
            current = current.next;
        }
        
        
        return true;
    }
}