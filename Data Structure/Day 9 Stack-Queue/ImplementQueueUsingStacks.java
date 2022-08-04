import java.util.Stack;

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        myQueue.peek(); // return 1
        myQueue.pop(); // return 1, queue is [2]
        myQueue.empty(); // return false
    }
}

class MyQueue {
    static Stack<Integer> stack1;
    static Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }
    
    public int pop() {
        if (stack1.isEmpty()){
            System.out.println("Queue is Empty");
            System.exit(0);
        }
        return stack1.pop();
    }
    
    public int peek() {
        return stack1.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
}
class MyQueue1 {
    static Stack<Integer> stack1;
    static Stack<Integer> stack2;

    public MyQueue1() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is empty");
            System.exit(0);
        }

        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    
    public int peek() {
        if (stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is empty");
            System.exit(0);
        }

        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    
    public boolean empty() {
        return (stack1.isEmpty() && stack2.isEmpty());
    }
}
