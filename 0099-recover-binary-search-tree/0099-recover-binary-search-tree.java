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
    private TreeNode First = null;
    private TreeNode Second = null;
    private TreeNode prev = null;
    // public void inorder(TreeNode root, List<TreeNode> list){
    //     if(root==null) return;
    //     inorder(root.left, list);
    //     list.add(root);
    //     inorder(root.right, list);
    // }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=null && prev.val>root.val){
            if(First==null){
                First = prev;
            }
            Second = root;
        }
        prev = root;
        inorder(root.right);
    }
    public void recoverTree(TreeNode root) {
        // List<TreeNode> list = new ArrayList<>();
        // inorder(root, list);
        // TreeNode a = null;
        // TreeNode b = null;
        // for(int i=0; i<list.size()-1; i++){
        //     if(list.get(i).val>list.get(i+1).val){
        //         if(a==null){
        //             a = list.get(i);
        //         }
        //         b = list.get(i+1);
        //     }
        // }
        // if(a!=null && b!=null){
        //     int temp = a.val;
        //     a.val = b.val;
        //     b.val = temp;
        // }
        First = null;
        Second = null;
        prev = null;
        inorder(root);
        if(First!=null && Second!=null){
            int temp = First.val;
            First.val = Second.val;
            Second.val = temp;
        }
    }
}