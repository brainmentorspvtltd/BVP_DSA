class Queue {
    int data[];
    int front;
    int rear;
    int size;
    Queue(int len) {
        data = new int[len];
        front = rear = -1;
        size = 0;
    }

    int getSize() {
        return size;
    }
    int getFront() {
        return front;
    }
    int getRear() {
        return rear;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int e) {
        if(isEmpty()) {
            front = 0;
        }
        rear++;
        size++;
        if(rear == data.length) {
            throw new RuntimeException("Queue is Full...");
        }
        data[rear] = e;
    }

    int dequeue() {
        if(isEmpty()) {
            throw new RuntimeException("Queue is Empty...");
        }
        int e = data[front];
        front++;
        size--;
        return e;
    }

    void print() {
        while(!isEmpty()) {
            System.out.println(dequeue());
            // System.out.println(data[i]);
        }
    }

}

public class QueueCRUD {
    public static void main(String[] args) {
        
    }
}
