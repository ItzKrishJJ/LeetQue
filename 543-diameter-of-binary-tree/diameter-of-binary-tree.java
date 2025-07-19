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
    int maxdia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        // return maxHeight(root.left) + maxHeight(root.right);
        maxHeight(root);
        return maxdia;
    }
    public int maxHeight(TreeNode node)
    {
        if(node==null) return 0;
        int lh = maxHeight(node.left);
        int rh = maxHeight(node.right);

        maxdia = Math.max(maxdia, lh+rh);
        return 1 + Math.max(lh,rh);
    }
}