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
    public boolean inorderTraversal(TreeNode p, TreeNode q){
        if((p != null && q == null) || (p == null && q != null)){
            return false;
        }
        if(p == null || q == null){
            return true;
        }
        boolean a = inorderTraversal(p.left, q.left);
        if(p.val != q.val || a==false){
            return false;
        }
        a = inorderTraversal(p.right, q.right);
        return a;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return inorderTraversal(p, q);
    }
}