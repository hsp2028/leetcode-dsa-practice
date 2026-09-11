/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode lR = lowestCommonAncestor(root.left, p, q);
        TreeNode rR = lowestCommonAncestor(root.right, p, q);

        if(lR == null){
            return rR;
        }
        if(rR == null){
            return lR;
        }
        return root;
    }
}