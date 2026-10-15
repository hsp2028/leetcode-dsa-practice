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
    private TreeNode buildBinaryTree(int[] nums, int left, int right){
        if(left>right){
            return null; 
        }
        int mid = left+(right-left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildBinaryTree(nums, left, mid-1);
        node.right = buildBinaryTree(nums, mid+1, right);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = buildBinaryTree(nums, 0, nums.length-1);
        return root;
    }
}