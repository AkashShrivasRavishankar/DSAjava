/*
Approach
Time Complexity: O(n)
Space Complexity: O(n)
1. Created an Array linked list, which is much more efficient in order to store memory, it has dynamic memory allocation.
2. Using a variable ptr for stack implementation, whenever there is an opening bracket memory is used from the heap, since the top bracket of the stack must match the nearest closing bracket, this implementation is the most efficient.
3. In case some opening brackets are left unclosed, the return ptr==null statement will take care of it.

*/






class Arr{
    char c;
    Arr next;
    Arr(char d){
        c=d;
        next=null;
    }
}
class Solution {
    public boolean isValid(String s) {
        Arr ptr=null;
        for(char ch : s.toCharArray() ){
            if(ch=='(' || ch=='[' || ch=='{'){
                Arr node=new Arr(ch);
                node.next=ptr;
                ptr=node;
            }
            else{
                if(ptr==null)
                    return false;
                if(ch==')' && ptr.c!='(')
                    return false;
                if(ch==']' && ptr.c!='[')
                    return false;
                if(ch=='}' && ptr.c!='{')
                    return false;
                ptr=ptr.next;
            }
        }
        return ptr==null;
    }
}