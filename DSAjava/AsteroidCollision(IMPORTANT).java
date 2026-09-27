/*
Approach
Time Complexity: O(n)
Space Complexity: O(n)
1. Created an a stack for continuous comparison in order to compare the magnitude of opposing asteroids.
2. Inside a loop that traverses the entire length of the asteroids array, a while loop is used to compare the top of the stack with the succeeding element of the asteroids array. At the beginning one element is pushed onto the stack.
3. Then, incase of opposing signs of the top element and the array, both are compared and popped incase the asteroids element is greater or equal in magnitude. If it is greater it is CONTINUED, in order to destroy other asteroids in the stack with lower magnitude if it is NON EMPTY.
4. Incase any of the 3 conditions are not fulfilled, the current element is pushed onto the stack.
5. Finally the elements of the stack is popped into a solution array where it is returned.

*/

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        for(int a : asteroids){
            boolean b=true;
            while(!s.isEmpty() && s.peek()>0 && a<0){
                if(s.peek()< -a){
                    s.pop();
                    continue; }
                else if(s.peek()== -a){
                    s.pop();
                }
                b=false;
                break;
            }
            if(b){
                s.push(a);
            }
        }
        int[] r=new int[s.size()];
        for(int i=s.size()-1;i>-1;i--){
            r[i]=s.pop();
        }
        return r;
        
    }
}