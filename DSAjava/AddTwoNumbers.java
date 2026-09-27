/*
Approach:
Time Complexity: O(max(m,n))
Space Complexity: O(1)
1. By performing digit by digit addition, a new linked list is created.
2. I initialized the values of each node as 0 at the beginning incase, one of the linked lists is already traversed, thus keeping its default value as 0.
3. By taking the mod of the digit by digit addition, the carry process is executed properly. Each time the addition exceeds 9, the carry for the next number is made 1.
4. At the end, if a carry is 1, the last node's value is kept as 1.



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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode head = new ListNode();
        ListNode ptr = head;
        while(l1!=null || l2!=null){
            int a=0,b=0;
            if(l1!=null){
                a=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                b=l2.val;
                l2=l2.next;
            }
            ptr.next=new ListNode((a+b+carry)%10);
            carry = a+b+carry >= 10 ? 1:0;
            ptr=ptr.next;
        }
        if(carry==1)
           ptr.next=new ListNode(1);
        return head.next;
            

    
}
}
