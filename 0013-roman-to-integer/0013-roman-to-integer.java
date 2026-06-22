class Solution {
    private int getValue(char c){
        return switch(c){
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
    public int romanToInt(String s) {
        
        // Bruteforce Solution
        // Map<Character, Integer> map = new HashMap<>();
        // map.put('I', 1);
        // map.put('V', 5);
        // map.put('X', 10);
        // map.put('L', 50);
        // map.put('C', 100);
        // map.put('D', 500);
        // map.put('M', 1000);
        
        // int res = 0;
        
        // for(int i = 0; i<s.length(); i++){
        //     int val = map.get(s.charAt(i));

        //     if(i+1 < s.length() && val < map.get(s.charAt(i+1)))
        //         res -= val;
        //     else
        //         res += val;
        // }
        // return res;

        // Optimal Solution
        int res = 0;
        int len = s.length();
        for(int i=0; i<len-1; i++){
            int current = getValue(s.charAt(i));
            int next = getValue(s.charAt(i+1));

            if(next>current){
                res -= current;
            }
            else{
                res += current;
            }
        }
        res += getValue(s.charAt(len-1));
        return res;
    }
}