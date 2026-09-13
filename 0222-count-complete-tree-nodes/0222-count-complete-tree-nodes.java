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
    public int lh(TreeNode root){
        int height = 0;
        while(root!=null){
            height++;
            root = root.left;
        }
        return height;
    }
    public int rh(TreeNode root){
        int height = 0;
        while(root!=null){
            height++;
            root = root.right;
        }
        return height;
    }
    public int countNodes(TreeNode root) {
        if(lh(root)==rh(root)){
            return (1<<lh(root))-1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}