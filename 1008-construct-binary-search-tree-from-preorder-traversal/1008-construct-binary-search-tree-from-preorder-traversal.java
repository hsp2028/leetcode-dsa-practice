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
    public void insert(TreeNode root, int val){
        // if(root == null){
        //     return new TreeNode(val);
        // }
        TreeNode prev = null;
        TreeNode temp = root;
        while(temp!=null){
            if(val<temp.val){
                prev = temp;
                temp = temp.left;
            }
            else{
                prev = temp;
                temp = temp.right;
            }
        }
        if(val<prev.val){
            prev.left = new TreeNode(val);
        }
        else{
            prev.right = new TreeNode(val);
        }
        // return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        TreeNode dummy = new TreeNode(0);
        dummy.left = root;
        for(int i=1; i<preorder.length; i++){
            insert(root, preorder[i]);
        }
        return dummy.left;
    }
}