class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> row = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> row1 = new ArrayList<>();
            row.add(row1);
            for(int j=0; j<=i; j++){
                if(j!=0 && j!=i){
                    row.get(i).add(j, row.get(i-1).get(j-1)+row.get(i-1).get(j));
                }
                else{
                    row1.add(j, 1);
                }
            }
        }
        return row;
    }
}