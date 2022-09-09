import java.util.PriorityQueue;

public class KthLargest {

    static void findLargest(int k) {
        int arr[] = {3,2,5,7,8,4,5,23};
        PriorityQueue heap = new PriorityQueue<>();
        for(int n : arr) {
            heap.add(n);
            // System.out.println(heap);
            if(heap.size() > k) {
                heap.poll();
            }
        }
        // System.out.println(heap);
        System.out.println(heap.poll());
    }

    public static void main(String[] args) {
        findLargest(3);
    }
}
