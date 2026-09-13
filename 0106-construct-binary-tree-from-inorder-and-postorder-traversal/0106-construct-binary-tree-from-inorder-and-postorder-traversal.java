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
    public TreeNode buildTree(int[] postorder, int posS, int posE, int[] inorder, int inS, int inE, HashMap<Integer, Integer> map){
        if(posS > posE || inS > inE){
            return null;
        }
        TreeNode root = new TreeNode(postorder[posE]);
        int rootIdx = map.get(postorder[posE]);
        int rst = inE-rootIdx;
        root.left = buildTree(postorder, posS, posE-rst-1, inorder, inS, rootIdx-1, map);
        root.right = buildTree(postorder, posE-rst, posE-1, inorder, rootIdx+1, inE, map);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        TreeNode root = buildTree(postorder, 0, postorder.length-1, inorder, 0, inorder.length-1, map);
        return root;
    }
}