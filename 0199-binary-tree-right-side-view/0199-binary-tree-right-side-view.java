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
    public void rightDFS(TreeNode node, int level, List<Integer> list){
        if(node==null){
            return;
        }
        if(level == list.size()){
            list.add(node.val);
        }
        rightDFS(node.right, level+1, list);
        rightDFS(node.left, level+1, list);
    }
    public List<Integer> rightSideView(TreeNode root) {
        // Bruteforce Solution
        // List<Integer> list1 = new ArrayList<>();
        // Queue<TreeNode> q = new LinkedList<>();
        // q.add(root);
        // if(root == null){
        //     return list1;
        // }
        // while(!q.isEmpty()){
        //     int n = q.size();
        //     for(int i=0; i<n; i++){
        //         TreeNode node = q.poll();
        //         if(i==n-1){
        //             list1.add(node.val);
        //         }
        //         if(node.left != null){
        //             q.add(node.left);
        //         }
        //         if(node.right != null){
        //             q.add(node.right);
        //         }
        //     }
        // }
        // return list1;

        // Optimal Solution

        List<Integer> list = new ArrayList<>();
        int level = 0;
        rightDFS(root, level, list);
        return list;
    }
}