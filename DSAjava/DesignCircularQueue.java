/*
Approach:
Time Complexity: O(1) for all functions
Space Complexity: O(k) Overall
1. By using front,rear,size  to keep track of the circular static queue, All functions are handled. The constructor initializes the already declared array to a size k which is stored in the global size variable and front and rear is set to -1
2. By using isFull() and isEmpty() functions within enQueue and deQueue, the functions are easily handled. With the help of modulo operator, the circular queue is designed in a way that in enqueue the rear variable is advanced whereas in dequeue the front variable is advanced. 
3. Using the variables front and rear, the functions front and rear return the required values correspondingly.

*/

class MyCircularQueue {
    int[] a;
    int front,rear,size;
    public MyCircularQueue(int k) {
        a=new int[k];
        size=k;
        front=rear=-1;
    }
    
    public boolean enQueue(int value) {
        if(isFull())
            return false;
        if(front==-1)
            front=0;
        rear=(rear+1)%size;
        a[rear]=value;
        return true;
        
    }
    
    public boolean deQueue() {
        if(isEmpty())
           return false;
        if(front==rear)
           front=rear=-1;
        else
           front=(front+1)%size;
        return true;
    }
    
    public int Front() {
        if(front==-1)
           return -1;
        return a[front];
    }
    
    public int Rear() {
        if(rear==-1)
           return -1;
        return a[rear];
        
    }
    
    public boolean isEmpty() {
        return front==-1 ;
    }
    
    public boolean isFull() {
        return (rear+1)%size==front; 
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */