public class CircularQueue {

    int arr[];
    int front;
    int rear;
    final int DEFAULT_CAPACITY = 10;

    CircularQueue() {
        arr = new int[DEFAULT_CAPACITY];
        rear = front = 0;
    }

    int getSize() {
        return rear;
    }

    boolean isEmpty() {
        return rear == 0;
    }

    void enqueue(int e) {
        if(rear == arr.length) {
            System.out.println("Queue is full...");
        }
        int avail = (rear + front) % arr.length;
        arr[avail] = e;
        rear++;
    }

    int dequeue() {
        if(rear == 0) {
            throw new RuntimeException("Queue is Empty...");
        }
        int val = arr[front];
        arr[front] = 0;
        front = (front + 1) % arr.length;
        rear--;
        return val;
    }



    public static void main(String[] args) {
        
    }
}
