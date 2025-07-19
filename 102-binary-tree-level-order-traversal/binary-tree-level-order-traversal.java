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
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> list = new ArrayList<>();
        if(root==null) return list;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int level = queue.size();
            List<Integer> l1 = new ArrayList<>();
            for(int i=0;i<level;i++)
            {
                if(queue.peek().left !=null)
                {
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right !=null)
                {
                    queue.offer(queue.peek().right);
                }
                l1.add(queue.poll().val);
            }
            list.add(l1);
        } 

        return list;
    }
}