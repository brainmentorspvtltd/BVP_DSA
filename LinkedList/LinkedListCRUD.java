public class LinkedListCRUD<T> {
    private Node<T> start;

    int getCount() {
        Node<T> temp = start;
        int counter = 0;
        while(temp != null) {
            temp = temp.next;
            counter++;
        }
        return counter;
    }

    void insertAtBeg(Node<T> node) {
        if(start == null) {
            start = node;
            return;
        }
        node.next = start;
        start = node;
    }

    void insertAtMid(Node<T> node, int pos) {
        int count = getCount();
        if(pos > count) {
            throw new RuntimeException("Invalid Position");
        }
        if(pos == 0) {
            insertAtBeg(node);
            return;
        }
        int i = 1;
        Node<T> temp = start;
        while(i < pos) {
            temp = temp.next;
            i++;
        }
        // Node<T> nextNode = temp.next;
        node.next = temp.next;
        temp.next = node;
    }

    void insertAtEnd(Node<T> node) {
        // If list is empty
        if(start == null) {
            start = node;
            return;
        }
        // If list has only one node
        if(start.next == null) {
            start.next = node;
            return;
        }

        Node<T> current = start;
        while(current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    void deleteInMid() {
        
    }

    void print() {
        Node<T> temp = start;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListCRUD<Integer> obj = new LinkedListCRUD<>();
        obj.insertAtBeg(new Node<Integer>(12));
        obj.insertAtBeg(new Node<Integer>(18));
        obj.insertAtBeg(new Node<Integer>(20));
        obj.insertAtBeg(new Node<Integer>(5));
        obj.insertAtEnd(new Node<Integer>(100));
        obj.print();
    }
}
