class Stack {
    private int[] stack;
    private int top;
    private int maxSize;

    // Constructor to initialize the stack
    public Stack(int size) {
        stack = new int[size];
        top = -1;
        maxSize = size;
    }

    // Push an element onto the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow");
        } else {
            stack[++top] = value;
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            return stack[top--];
        }
    }

    // Peek at the top element of the stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }



    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Top element after pop is: " + stack.peek());
    }
}
