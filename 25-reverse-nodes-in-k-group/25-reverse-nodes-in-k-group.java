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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev = null;
    ListNode curr = head;
    ListNode temp = head;
    
    int count = 0;  // to only execute the reverse function for k times
    
    // check if there are enough elements ahead for k to run
    
    int check = k;
    
    while(check != 0)
    {
        if(temp == null)
        {
            return head;
        }
        temp = temp.next;
        check--;
    }
    
    while(curr != null && count < k)
    {
        temp = curr.next;
        
        curr.next = prev;
        
        prev = curr;
        curr = temp;
        
        count++;
    }
    
    if(temp != null)
    {
        head.next = reverseKGroup(temp, k);    // it will attach the head to the head of the newly transformed (reversed) linked list
    }
    
    return prev;    // the reason of returning this prev is - how internally the recursion function call works
    
    // Consider an example of 1->2->3->4 with k = 2
    // after the reverse in first iteration we will get 
    // null<-1-<2    3->4->null
    // here prev = 2, and head = 1
    // now after second iteration - with the head.next part
    // 2->1->4->3
    // in second iteration prev = 4, and head = 3
    // but, in the case of recursion - when we return them it takes its parent value which was originally 2
}

}