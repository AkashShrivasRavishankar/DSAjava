/*
Approach:
Time Complexity: O(n) 
Space Complexity: O(h) where h is the size of tree
1. Here, the base case is when both the nodes have been completely traversed and if BOTH are null then it returns true. This also works when two empty nodes are called.
2. If any one of the nodes are null, then the function returns false as it implies one of the trees has a missing node.
3. Using the concept of recursion, only if both the trees have the same current value, and the recursive calls of both the left and the right of the node returns true, the function returns true.

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
      if(p==null && q==null)  return true;
      if(p==null || q==null)  return false;
      return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}