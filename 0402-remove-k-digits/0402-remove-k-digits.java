class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<num.length(); i++){
            char digit = num.charAt(i);
            while(!stack.isEmpty() && k>0 && stack.peek()>digit){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while(k>0){
            stack.pop();
            k--;
        }
        if(stack.isEmpty()) return "0";
        StringBuilder sb = new StringBuilder();
        for(int i=stack.size()-1; i>=0; i--){
            sb.append(stack.get(i));
        }
        while(sb.length()>0 && sb.charAt(sb.length()-1)=='0'){
            sb.deleteCharAt(sb.length()-1);
        }
        sb.reverse();
        if(sb.length()==0) return "0";
        return sb.toString();
    }
}