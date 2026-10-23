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
    public int sumOfSubtree(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.val;
        int leftSum = sumOfSubtree(root.left);
        int rightSum = sumOfSubtree(root.right);
        return root.val+leftSum+rightSum;
    }
    public int findTilt(TreeNode root) {
        if(root==null) return 0;
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0; i<n; i++){
                TreeNode node = q.poll();
                list.add(node.val);
                int leftSum = sumOfSubtree(node.left);
                int rightSum = sumOfSubtree(node.right);
                sum += Math.abs(leftSum-rightSum);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
        }
        System.out.println(list);
        return sum;
    }
}