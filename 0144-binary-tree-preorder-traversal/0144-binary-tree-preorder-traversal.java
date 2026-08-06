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
    private void traverse(TreeNode root, List list){

        if(root==null){
            return;
        }
        list.add(root.val);
        traverse(root.left, list);
        traverse(root.right, list);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> list = new ArrayList<>();
    //     traverse(root, list);
    //     return list;


        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null){
            return list;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }
        return list;
    }
}