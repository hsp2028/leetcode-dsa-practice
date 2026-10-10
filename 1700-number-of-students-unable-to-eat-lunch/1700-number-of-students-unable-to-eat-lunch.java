class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<students.length; i++){
            q.add(students[i]);
        }
        for(int j=sandwiches.length-1; j>=0; j--){
            s.push(sandwiches[j]);
        }
        int count = 0;
        while(!q.isEmpty()){
            if(count>q.size()) break;
            int student = q.poll();
            int sandwich = s.peek();
            if(student != sandwich){
                q.add(student);
                count++;
            }
            else{
                s.pop();
                count=0;
            }
        }
        return q.size();
    }
}