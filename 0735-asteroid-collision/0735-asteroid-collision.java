class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        int n = asteroids.length;
        for(int i=0; i<n; i++){
            if(asteroids[i]>0){
                stack.push(asteroids[i]);
            }
            else{
                boolean flag = true;
                while(!stack.isEmpty() && stack.peek()<=Math.abs(asteroids[i])){
                    if(stack.peek()==Math.abs(asteroids[i])){
                        stack.pop();
                        System.out.println(stack);
                        flag = false;
                        break;
                    }
                    stack.pop();
                }
                if(stack.isEmpty() && flag){
                    list.add(asteroids[i]);
                }
            }
        }
        for(int num : stack){
            list.add(num);
        }
        int[] res = list.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
}