/*
Approach:
Time Complexity: O(n)
Space Complexity: O(1)
1. By visualizing a circle and applying Floyd's theorum, the cycle is found.
2. I used two pointers pointing to the head, one taking 1 step at a time while the other took 2 steps at a time.
3. Since for a cyclic list, approaching null is impossible, this algorithm works.
4. If there is no cycle, eventually the while loop comes to an end and false is returned.



*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode ptr=head;
        ListNode ptr2=head;
        while(ptr!=null && ptr.next!=null){
            ptr2=ptr2.next;
            ptr=ptr.next.next;
            if(ptr==ptr2)
                return true;
        }
        return false;
} }
