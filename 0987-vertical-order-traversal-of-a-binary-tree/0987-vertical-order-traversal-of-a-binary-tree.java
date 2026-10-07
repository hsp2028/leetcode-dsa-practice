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
 class Pair{
    TreeNode node;
    int[] pos;
    public Pair(TreeNode node, int[] pos){
        this.node = node;
        this.pos = pos;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, List<int[]>> map = new TreeMap<>();
        q.add(new Pair(root, new int[]{0, 0}));
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0; i<n; i++){
                Pair pair = q.poll();
                TreeNode node = pair.node;
                int row = pair.pos[0];
                int col = pair.pos[1];
                if(!map.containsKey(col)){
                    map.put(col, new ArrayList<>(List.of(new int[]{row, node.val})));
                }
                else{
                    map.get(col).add(new int[]{row, node.val});
                }
                if(node.left!=null){
                    q.add(new Pair(node.left, new int[]{row+1, col-1}));
                }
                if(node.right!=null){
                    q.add(new Pair(node.right, new int[]{row+1, col+1}));
                }
            }
        }
        for(Map.Entry<Integer, List<int[]>> entry : map.entrySet()){
            List<Integer> list2 = new ArrayList<>();
            List<int[]> list3 = entry.getValue();
            list3.sort((a, b)->{
                if(a[0]!=b[0]){
                    return Integer.compare(a[0], b[0]);
                }
                else{
                    return Integer.compare(a[1], b[1]);
                }
            });
            int n = list3.size();
            for(int i=0; i<n; i++){
                list2.add(list3.get(i)[1]);
            }
            list.add(list2);
        }
        return list;
    }
}