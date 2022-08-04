public class SumOfEvenAndOddPlaces {

    static int sum(int num, int arr[]){
        // Brake
        if(num ==0){
            return 0;
        }
        // Small Problem + Cycle
        int currentPlace = sum(num/10,arr);
        int rem = num%10;
        currentPlace = currentPlace + 1;
        if(currentPlace%2 ==0){
            // Even Place
            arr[1] = arr[1] + rem;
        }
        else{
            // Odd Place
            arr[0] = arr[0] + rem;
        }
        return currentPlace;
         

    }
    public static void main(String[] args) {
        int arr[] = new int[2]; 
        sum(2741, arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
