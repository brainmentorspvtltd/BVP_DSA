class Stack {
    int arr[];
    int capacity;
    int top;
    public Stack(int capacity) {
        this.capacity = capacity;
        top = -1;
        arr = new int[capacity];
    }

    int getSize() {
        return top+1;
    }

    public void push(int n) {
        if(getSize() == capacity - 1) {
            throw new RuntimeException("Stack is full...");
        }
        top++;
        arr[top] = n;
    }
    public int pop() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty...");
        }
        int element = arr[top];
        arr[top--] = 0;
        return element;
    }
    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is Empty...");
        }
        return arr[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        for(int e : arr) {
            System.out.print(e + ",");
        }
    }
}

public class StackCRUD {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(4);
        st.push(12);
        st.push(7);
        st.push(9);

        System.out.println(st.pop());
        
        st.printStack();
    }
}
