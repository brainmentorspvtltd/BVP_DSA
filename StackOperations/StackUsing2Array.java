public class StackUsing2Array {
    int arr[];
    int capacity;
    int leftTop;
    int rightTop;
    
    StackUsing2Array(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        leftTop = -1;
        rightTop = capacity;
    }

    void leftPush(int element) {
        if(leftTop < rightTop) {
            leftTop++;
            arr[leftTop] = element;
        }
    }

    void rightPush(int element) {
        if(leftTop < rightTop) {
            rightTop--;
            arr[rightTop] = element;
        }
    }

    int leftPop() {
        if(leftTop == -1) {
            throw new RuntimeException("Left Stack is Empty...");
        }
        int element = arr[leftTop];
        arr[leftTop--] = 0;
        return element;
    }

    int rightPop() {
        if(rightTop == capacity) {
            throw new RuntimeException("Right Stack is Empty...");
        }
        int element = arr[rightTop];
        arr[rightTop++] = 0;
        return element;
    }

    void print() {
        System.out.println("Array...");
        for(int i = 0; i < capacity; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.println("Left Stack");
        for(int i = 0; i <= leftTop; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.println("Right Stack");
        for(int i = capacity-1; i >= rightTop; i--) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args) {
        StackUsing2Array st = new StackUsing2Array(8);
        st.leftPush(10);
        st.leftPush(20);
        st.leftPush(30);
        
        st.rightPush(101);
        st.rightPush(102);
        st.rightPush(103);

        st.print();

        st.leftPop();
        st.rightPop();

        st.leftPush(40);
        st.leftPush(50);
        st.leftPush(60);

        st.print();
    }


}
