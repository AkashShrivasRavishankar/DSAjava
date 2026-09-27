/*
Approach:
Time Complexity: XX
Space Complexity: O(n)
1. Since Queue is an interface, is it declared at the beginning without allocating space. In the constructor, a linkedlist is created.
2. While the push function is just adding within the queue, the pop and top is handled in such a way that it acts like a stack.
3. In the pop function, the entire queue ahead of the last element is brought behind the last element, making it the front element, it is then removed and returned. The top function is similar, except the last element is stored in a variable and then removed and brought back to the end of queue as to not delete the element.
4. the .isEmpty() takes care of the boolean Empty function

*/

class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q=new LinkedList<>(); //since Queue is an interface
    }
    
    public void push(int x) {
        q.add(x);
    }

    
    public int pop() {
        for(int i=1;i<q.size();i++)
            q.add(q.remove());
        return q.remove();
    }
    
    public int top() {
        for(int i=1;i<q.size();i++)
            q.add(q.remove());
        int p=q.peek();
        q.add(q.remove());
        return p;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */