/*
Approach:
Time Complexity: O(log n) worst case O(n)
Space Complexity: O(log n) worst case O(n)
1. Through recursion, The node to be deleted is searched by splitting the tree into subtrees.
2. Once node is found all 4 cases are checked one by one, if it is a leaf node, simply null is returned, thus the value of root.left or right is modified.
3. If it is a RR or LL case, the direct child of the node is returned.
4. In the case with two children, firstly a function is called to find the inorder predecessor of the node, lets call it P.
5. Then the node's value is changed to the value of P. 
6. Now, since we are replacing the node with the in order predecessor, it's left subtree needs to delete P, so deleteNode is recursively called with the left subtree as head and the value of P as key.

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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(key < root.val){
            root.left=deleteNode(root.left,key);
        }
        else if(key > root.val){
            root.right=deleteNode(root.right,key);
        }
        else{
            if(root.left == null && root.right == null) return null;
            if(root.left==null)  return root.right;
            if(root.right==null) return root.left;
            TreeNode pre = iOP(root);
            root.val=pre.val;
            root.left= deleteNode(root.left,pre.val);
        }
        return root;

        
    }
    public TreeNode iOP(TreeNode root){
        root=root.left;
        while(root.right!=null){
            root=root.right;
        }
        return root;
    }
}