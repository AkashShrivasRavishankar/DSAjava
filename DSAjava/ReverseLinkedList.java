/*
Approach:
Time Complexity: O(n)
Space Complexity: O(n)

1.By creating an array to store all the elements of the linked list and iterating it reversely, The reversed list is returned.
2.Firstly, the number of elements in the linked list are noted
3.An array of its corresponding size is created and stores the value in the normal order. It is then reversed and new nodes are created simultaneously.
4. This approach is not as memory efficient, however it is more intuitive.

*/




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
    public ListNode reverseList(ListNode head) {
        if(head==null)
           return head;
        int a=0;
        ListNode ptr = head;
        while(ptr!=null){
           a++;
           ptr=ptr.next; }
        int[] b = new int[a];
        ptr=head;
        for(int i=0;i<a;i++){
            b[i]=ptr.val;
            ptr=ptr.next;
        }
        ListNode c=new ListNode(b[a-1]);
        ptr=c;
        for(int i=a-2;i>=0;i--){
            ListNode d = new ListNode(b[i]);
            ptr.next=d;
            ptr=d;
        }
        return c;
        
    }
}

