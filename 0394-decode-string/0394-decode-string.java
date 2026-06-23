class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> str = new Stack<>();
        Stack<Integer> num = new Stack<>();
        StringBuilder s1 = new StringBuilder();
        int k = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch<= '9'){
                k = k * 10 + (ch - '0');
            }
            else if(ch == '['){
                str.push(s1);
                num.push(k);
                s1 = new StringBuilder();
                k = 0;
            }
            else if(ch == ']'){
                int n = num.pop();
                StringBuilder s2 = str.pop();
                for(int j=0; j<n; j++){
                    s2.append(s1);
                }
                s1 = s2;
            }
            else{
                s1 = s1.append(ch);
            }
        }
        return s1.toString();
    }
}