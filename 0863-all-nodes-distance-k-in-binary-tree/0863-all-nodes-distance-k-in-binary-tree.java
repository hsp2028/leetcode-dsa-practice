/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        Map<TreeNode, TreeNode> map = new HashMap<>();
        // map.put(root, root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0; i<n; i++){
                TreeNode node = q.poll();
                if(node.left!=null){
                    q.add(node.left);
                    map.put(node.left, node);
                }
                if(node.right!=null){
                    q.add(node.right);
                    map.put(node.right, node);
                }
            }
        }
        Queue<TreeNode> q1 = new LinkedList<>();
        HashSet<TreeNode> set = new HashSet<>();
        q1.add(target);
        set.add(target);
        int level = 0;
        while(!q1.isEmpty()){
            int n = q1.size();
            if(level==k){
                break;
            }
            for(int i=0; i<n; i++){
                TreeNode node = q1.poll();
                set.add(node);
                if(node.left!=null && !set.contains(node.left)){
                    q1.add(node.left);
                    set.add(node.left);
                }
                if(node.right!=null && !set.contains(node.right)){
                    q1.add(node.right);
                    set.add(node.right);
                }
                if(map.containsKey(node) && !set.contains(map.get(node))){
                    q1.add(map.get(node));
                    set.add(map.get(node));
                }
            }
            level++;
        }
        while(!q1.isEmpty()){
            list.add(q1.poll().val);
        }
        return list;
    }
}