/*
Approach:
Time Complexity: O(m+n)
Space Complexity: O(1)
1. I firstly checked if either of the linked lists were null, which if it was true returned the other linked list.
2. I used a head pointer, to point to the smallest element of the two linked lists, which served as the starting point of the loop check.
3. Using the same logic as merging two sorted arrays, i used a while loop which would run as far as both of the linked lists were not null.
4. If either of the linked lists were traversed, the next of the ptr will point to the other linked list, thus pushing all the remaining elements to the merged linked list



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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        ListNode head;
        if (list1.val <= list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }
        ListNode ptr = head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                ptr.next = list1;
                list1 = list1.next;
            } else {
                ptr.next = list2;
                list2 = list2.next;
            }
            ptr = ptr.next;
        }
        if (list1 != null) 
            ptr.next=list1;
        else 
            ptr.next=list2;
        return head;

    }
}
