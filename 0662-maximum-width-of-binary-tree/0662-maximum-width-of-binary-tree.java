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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(root, 1));
        int maxW = Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int n = q.size();
            int minIdx = q.peek().getValue();
            int first = 0, last = 0;
            for(int i=0; i<n; i++){
                Pair<TreeNode, Integer> map = q.poll();
                TreeNode node = map.getKey();
                int idx = map.getValue();
                if(i==0){
                    first = idx;
                }
                if(i==n-1){
                    last = idx;
                }
                // for(Map.Entry<TreeNode, Integer> entry : map.entrySet()){
                //     node = entry.getKey();
                //     idx = entry.getValue();
                // }
                if(node.left!=null){
                    q.add(new Pair<>(node.left, 2*idx));
                }
                if(node.right!=null){
                    q.add(new Pair<>(node.right, 2*idx+1));
                }
            }
            maxW = Math.max(maxW, last-first+1);
        }
        return maxW;
    }
}