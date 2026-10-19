class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++){
            List<Integer> list = new ArrayList<>();
            ans.add(list);
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    list.add(1);
                }
                else{
                    int val = ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    list.add(val);
                }
            }
        }
        return ans.get(rowIndex);
    }
}