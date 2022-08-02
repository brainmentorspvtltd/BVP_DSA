package DSA_Introduction;

public class ArraysCRUD {
    int arr[];
    int currentSize;
    ArraysCRUD(int capacity) {
        arr = new int[capacity];
        currentSize = 0;
    }

    void insert(int index, int value) {
        if(index > currentSize) {
            throw new RuntimeException("Index can't be greater than current size");
        }
        if(currentSize == arr.length) {
            System.out.println("Array is full...");
            return;
        }
        for(int i = currentSize - 1; i >= index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = value;
        currentSize++;
        System.out.println("Element inserted...");
    }

    void remove(int index) {
        if(currentSize == 0) {
            System.out.println("Array is Empty...");
            return;
        }
        for(int i = index; i < currentSize-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[currentSize-1] = 0;
        currentSize--;
        System.out.println("Element Removed...");
    }

    void search(int value) {

    }

    void update(int toUpdate, int updatedValue) {

    }

    void print() {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args) {
        ArraysCRUD obj = new ArraysCRUD(10);
        obj.insert(0, 12);
        obj.insert(1, 20);
        obj.insert(2, 10);
        obj.insert(3, 2);
        obj.print();
        obj.insert(2, 100);
        obj.print();
    }

}
