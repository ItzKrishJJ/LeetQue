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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null)
        {
            return res;
        }
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int n = queue.size();
            
            for(int i=0;i<n;i++)
            {
                TreeNode node = queue.poll();
                if(i==n-1)
                {
                    res.add(node.val);
                }
                if(node.left!=null)
                {
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }

        }
        return res;
    }
}