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
    public TreeNode buildTree(int[] preorder, int preS, int preE, int[] inorder, int inS, int inE, HashMap<Integer, Integer> map){
        if(preS > preE || inS > inE){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preS]);
        int rootIdx = map.get(preorder[preS]);
        int lst = rootIdx-inS;
        root.left = buildTree(preorder, preS+1, preS+lst, inorder, inS, rootIdx-1, map);
        root.right = buildTree(preorder, preS+lst+1, preE, inorder, rootIdx+1, inE, map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        TreeNode root = buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, map);
        return root;
    }
}