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
    public void inorder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    public boolean findTarget(TreeNode root, int k) {
        // HashSet<Integer> set = new HashSet<>();
        // Queue<TreeNode> q = new LinkedList<>();
        // q.add(root);
        // while(!q.isEmpty()){
        //     TreeNode node = q.poll();
        //     int remain = k-node.val;
        //     if(set.contains(remain)){
        //         return true;
        //     }
        //     set.add(node.val);
        //     if(node.left!=null){
        //         q.add(node.left);
        //     }
        //     if(node.right!=null){
        //         q.add(node.right);
        //     }
        // }
        // return false;

        // Better Approach
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int i=0, j=list.size()-1;
        while(i<j){
            if(list.get(i)+list.get(j)<k){
                i++;
            }
            else if(list.get(i)+list.get(j)>k){
                j--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}