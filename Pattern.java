public class Pattern {

    static void star(int numOfStar){
        // Brake (Termination Case)
        if(numOfStar == 0){
            return ;
        }
        System.out.print("*"); // Same line Star
        // Small Problem + Cycle
        star(numOfStar -1);
    }

    static void line(int startLine, int endLine){
        if(startLine>endLine){
            return ;
        }
         star(startLine); // Print the Star
         System.out.println(); // New Line
         line(startLine + 1, endLine); // Small Problem + Cycle
    }
    public static void main(String[] args) {
        line(1, 5);
    }
}
