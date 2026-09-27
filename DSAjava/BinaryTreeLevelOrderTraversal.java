/*
Approach:
Time Complexity: O(n) 
Space Complexity: O(W) where w is max width, worst case O(N) where it is a skewed tree
1. Here, we first declare a list of lists interface as an arraylist, incase of an exception case where the root is null, we return null.
2. We use a queue interface to keep track of all children nodes, beginning with the root. The queue simply stores each reference point.
3. .offer() and .poll() is used exclusively in queue for more space complexity efficiency rather than .add() and .remove() which take more memory to take care of exceptions
4. here we run a loop as long as the queue of children are not empty, firstly we declare a list to account for each level, and n stores the amount of children nodes.
5. running a for loop which adds the first case(root) with size 1, adds the root to the row list and checks for its children, and adds them into the queue of treenodes incase there are children. By updating the value of n the for loop runs again as per the number of children and repeats till the for loop is over.
6. After each for loop, the list is added to the list of lists in order to account for the level.

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List <List<Integer>> l = new ArrayList<>();
        if (root==null) return l;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            List<Integer> row = new ArrayList<>();
            int n=q.size();
            for (int i=0;i<n;i++){
                TreeNode front = q.poll();
                row.add(front.val);
                if (front.left !=null) q.offer(front.left);
                if (front.right !=null) q.offer(front.right);
            }
            l.add(row);
        }
        return l;
        
        
    }
}