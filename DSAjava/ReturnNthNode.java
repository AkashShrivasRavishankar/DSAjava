/*
Approach:
Time Complexity: O(max(m,n))
Space Complexity: O(1)
1. Firstly, I handle two exceptions which include the head being removed. If there is only one node and the position is 1, null is simply returned.
2. By finding the length of the list using a pointer, the second exception is handled, where if n equals the length of the list, the node which is next of head is returned.
3. By traversing (length-n) nodes ahead, the line ptr.next=ptr.next.next handles the removal of a node to be removed in between the list.
4. Once removed, head is simply returned thus returning the final list.



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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n==1)
            return null;
        int a=0;
        ListNode ptr=head;
        while(ptr!=null){
            ptr=ptr.next;
            a++;
        }
        if(a==n)
            return head.next;
        ptr=head;
        for(int i=0;i<a-n-1;i++){
            ptr=ptr.next; }
        
        ptr.next=ptr.next.next;
        return head;
        
    } 
}
