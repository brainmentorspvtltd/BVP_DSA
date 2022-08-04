public class EvenOdd {
    static void printEvenOdd(int num){
        // Brake
        if(num == 0){
            return ; 
        }    
        // 1st Small Problem in Cycle
            printEvenOdd(num-1);
            System.out.println(num%2==0?"Even No"+num:"Odd No"+num);
    }
    public static void main(String[] args) {
        
    }
}
