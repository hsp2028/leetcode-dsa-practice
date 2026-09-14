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
    public void preorder(TreeNode root, List<TreeNode> list){
        if(root == null){
            return;
        }
        if(root!=null){
            list.add(root);
        }
        preorder(root.left, list);
        preorder(root.right, list);
    }
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        preorder(root, list);
        if(root==null){
            return;
        }
        if(root.left!=null){
            root.left = null;
        }
        System.out.println(list.size());
        for(int i=1; i<list.size(); i++){
            root.right = list.get(i);
            root = root.right;
            root.left = null;
        }
    }
}