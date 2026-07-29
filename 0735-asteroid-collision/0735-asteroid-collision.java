class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // Bruteforce Solution
        // Stack<Integer> stack = new Stack<>();
        // List<Integer> list = new ArrayList<>();
        // int n = asteroids.length;
        // for(int i=0; i<n; i++){
        //     if(asteroids[i]>0){
        //         stack.push(asteroids[i]);
        //     }
        //     else{
        //         boolean flag = true;
        //         while(!stack.isEmpty() && stack.peek()<=Math.abs(asteroids[i])){
        //             if(stack.peek()==Math.abs(asteroids[i])){
        //                 stack.pop();
        //                 System.out.println(stack);
        //                 flag = false;
        //                 break;
        //             }
        //             stack.pop();
        //         }
        //         if(stack.isEmpty() && flag){
        //             list.add(asteroids[i]);
        //         }
        //     }
        // }
        // for(int num : stack){
        //     list.add(num);
        // }
        // int[] res = new int[list.size()];
        // for(int i=0; i<list.size(); i++){
        //     res[i] = list.get(i);
        // }
        // return res;

        // Optimal Solution
        Stack<Integer> stack = new Stack<>();

        for(int num : asteroids){
            if(num>0){
                stack.push(num);
            }
            else{
                while(!stack.isEmpty() && stack.peek()<-num && stack.peek()>0){
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek()==-num){
                    stack.pop();
                }
                else if(stack.isEmpty() || stack.peek()<0){
                    stack.push(num);
                }
            }
        }
        int[] ans = new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}