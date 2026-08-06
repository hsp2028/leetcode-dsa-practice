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
        traverse(root.left, list);
        list.add(root.val);
        traverse(root.right, list);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        // List<Integer> list = new ArrayList<>();
        // traverse(root, list);
        // return list;

        // Stack Solution
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(true){
            if(root!=null){
                stack.push(root);
                root = root.left;
            }
            else{
                if(stack.isEmpty()){
                    break;
                }
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        return list;
    }
}