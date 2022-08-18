// class Node {
//     int data;
//     Node next;
//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

class Node<T> {
    T data;
    Node<T> next;
    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        // Node n1 = new Node(12);
        // Node n2 = new Node(43);
        // n1.next = n2;
        // n1.next = new Node(43);
        // n1.next.next = new Node(17);
        // n1.next.next.next = new Node(50);
        
        // Node start = n1;
        // while(start != null) {
        //     System.out.println(start.data + "," + start.next);
        //     start = start.next;
        // }

        // Node<Integer> n1 = new Node<>(12);
        // n1.next = new Node<>(15);

        Node<Integer> n1 = new Node<>(12);
        Node<String> n2 = new Node<>("Hi");
        // n1.next = n2;

    }
}