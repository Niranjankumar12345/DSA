package dsa.stack;

public class StackExample {

    private int[] arr;
    private int top;
    private int capacity;

    public StackExample(int size) {
       arr = new int[size];
        capacity = size;
       top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = value;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return arr[top--];
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull(){return top == capacity-1;}

    public int size() {
        return top + 1;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");

            for(int i = 0; i <= top; ++i) {
                int var10001 = arr[i];
                System.out.print(var10001 + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        StackExample stack = new StackExample(5);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        stack.display();
        System.out.println("Popped: " + stack.pop());
        stack.display();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack Full? "+stack.isFull());
        System.out.println("Stack Size "+stack.size());
    }
}
