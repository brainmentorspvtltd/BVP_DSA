import java.util.Stack;

public class HistogramProblem {

    // static int getArea(int arr[], int n) {
    //     int result = 0;
    //     for(int i = 0; i < n; i++) {
    //         int current = arr[i];
    //         for(int j = i - 1; j >= 0; j--) {
    //             if(arr[j] >= arr[i]) {
    //                 current += arr[i];
    //             }
    //             else {
    //                 break;
    //             }
    //         }

    //         for(int j = i + 1; j < n; j++) {
    //             if(arr[j] >= arr[i]) {
    //                 current += arr[i];
    //             }
    //             else {
    //                 break;
    //             }
    //         }
    //         result = Math.max(result, current);
    //     }
    //     return result;
    // }

    static int getArea(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxArea = 0;
        for(int i = 0; i < n; i++) {
            while(st.peek() != -1 && arr[st.peek()] >= arr[i]) {
                int rightMostElement = i; // right most element is current element
                int topElement = st.pop(); // current top element
                int leftMostElement = st.peek(); // top most element in stack
                maxArea = Math.max(maxArea, arr[topElement] * (rightMostElement - leftMostElement - 1));
            }
            // if current bar is greater than the stack peek then keep 
            st.push(i);
        }

        while(st.peek() != -1) {
            maxArea = Math.max(maxArea, arr[st.pop()] * (arr.length - st.peek() - 1));
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        int n = arr.length;
        int res = getArea(arr, n);
        System.out.println("Area is : " + res);
    }
}
