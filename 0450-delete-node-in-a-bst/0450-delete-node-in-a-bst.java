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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        TreeNode dummy = new TreeNode(0);
        dummy.left = root;
        TreeNode prev = dummy;
        TreeNode curr = root;
        if(key > curr.val){
            curr.right = deleteNode(curr.right, key);
        }
        else if(key < curr.val){
            curr.left = deleteNode(curr.left, key);
        }
        else{
            if(curr.left == null && curr.right==null){
                return null;
            }
            else if(curr.left == null || curr.right == null){
                if(curr.left == null){
                    return root.right;
                }
                else{
                    return root.left;
                }
            }
            else{
                TreeNode temp = root.left;
                while(temp.right!=null){
                    temp = temp.right;
                }
                root.val = temp.val;
                root.left = deleteNode(root.left, temp.val);
            }
        }
        return root;
    }
}