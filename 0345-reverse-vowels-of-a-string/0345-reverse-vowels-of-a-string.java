class Solution {
    public String reverseVowels(String s) {
        int len = s.length();
        List<Character> list = new ArrayList<>();
        char[] str = s.toCharArray();
        for(int i=0; i<len; i++){
            if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U'){
                list.add(str[i]);
            }
        }
        char[] rev = new char[list.size()];
        for(int i=0; i<rev.length; i++){
            rev[i] = list.get(list.size()-1-i);
        }
        int j=0;
        for(int i=0; i<len; i++){
            if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U'){
                str[i] = rev[j];
                j++;
            }
        }
        return new String(str);
    }
}