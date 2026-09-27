/*
Approach
Time Complexity: O(n)
Space Complexity: O(n)
1. Created a stack in java, which stores Integers. Firstly a loop is ran across the entire array of strings. Whenever an operand is encountered, it is simply pushed onto the stack
2. By the nature of postfix, there will always be at least 2 operands on the integer stack when an operator is Encountered
3. Whenever an operator is encountered, the top 2 variables are popped and operated on with the corresponding variable and pushed on to the stack.
4. Finally only one operand is remaining on the stack, which is the final solution of the operation. It is popped and returned.

*/






class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(String o: tokens){
            if(o.equals("+") || o.equals("-") || o.equals("*") || o.equals("/")){
                    int a= s.pop();
                    int b= s.pop();
                    if(o.equals("+")){
                        s.push(b+a);
                    }
                    else if (o.equals("-")){
                        s.push(b-a);
                    }
                    else if (o.equals("*")){
                        s.push(b*a);
                    }
                    else if(o.equals("/")){
                        s.push(b/a); }
                    }
             else{
                        s.push(Integer.parseInt(o));
             }
        }
        return s.pop();
    }
}