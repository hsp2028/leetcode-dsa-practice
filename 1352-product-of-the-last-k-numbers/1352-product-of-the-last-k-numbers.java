class ProductOfNumbers {
    public List<Integer> list;
    public ProductOfNumbers() {
       list = new ArrayList<>();
    }
    
    public void add(int num) {
        list.add(num);
    }
    
    public int getProduct(int k) {
        int n = list.size();
        int product = 1;
        int i = 0;
        while(i!=k){
            product *= list.get(n-1-i);
            i++;
        }
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */