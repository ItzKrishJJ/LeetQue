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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
    
        findMaxSum(root);
        return maxSum;
    }
    public int findMaxSum(TreeNode root){
        if(root==null) return  0;
        int lm = Math.max(0,findMaxSum(root.left));
        int rm = Math.max(0,findMaxSum(root.right));
        maxSum = Math.max(maxSum, lm+rm+root.val);

        return (root.val) + Math.max(lm, rm);
    }
}