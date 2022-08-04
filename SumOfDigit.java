public class SumOfDigit {
    // this fn return sum of the digit
    static int sum(int num){
        // Brake Condition
        if(num == 0){
            return 0;
        }
        // Processing Logic (Build or Fall)
        // Small Problem + Cycle
        int result= sum(num/10);
        int rem = num % 10;
        return result + rem;
    }
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }
}
