import java.util.ArrayList;

class Heap {
    ArrayList<Integer> data = new ArrayList<>();
    void add(int item) {
        data.add(item);
        upHeapify(data.size() - 1);
    }

    void upHeapify(int childIndex) {
        int parentIndex = (childIndex - 1);
        if(data.get(childIndex) < data.get(parentIndex)) {
            swap(parentIndex, childIndex);
            upHeapify(parentIndex);
        }
    }

    void swap(int parentIndex, int childIndex) {
        int parentValue = data.get(parentIndex);
        int childValue = data.get(childIndex);
        data.set(childIndex, parentValue);
        data.set(parentIndex, childValue);
    }

    int delete() {
        return 0;
    }

    void downHeapify() {
        // get the left and right child index
        // left child index is less than parent node value than store left child index in minIndex
    }
}

public class HeapOperations {
    
}
