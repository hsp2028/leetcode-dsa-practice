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
    int res;
    int k;
    public void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            if(--k == 0){
                res = root.val;
                return;
            }
            inorder(root.right);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        inorder(root);
        return res;
    }
    // public void inorder(TreeNode root, List<Integer> list){
    //     }
    //     if(root == null){
    //         return;
    //     inorder(root.left, list);
    //     list.add(root.val);
    //     inorder(root.right, list);
    // }
    // public int kthSmallest(TreeNode root, int k) {
    //     List<Integer> list = new ArrayList<>();
    //     inorder(root, list);
    //     return list.get(k-1);
    // }
}