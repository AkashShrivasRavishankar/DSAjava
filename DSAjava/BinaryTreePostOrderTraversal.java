/*
Approach:
Time Complexity: O(n) 
Space Complexity: O(h) where h is the size of tree
1. Creating an arraylist as a class variable in order to keep track of the postorder traversal.
2. As long as the root is not null, the function is recursively called left, it is recursively called right and finally the value of the node is appended to the list.
3. As soon as all nodes are traversed, either the left or the right of the last node becomes null, thus returning the final postorder arraylist.

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> l = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)
             return l;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        l.add(root.val);
        
        return l;

    }
}