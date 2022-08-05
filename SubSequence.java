import java.util.ArrayList;

public class SubSequence {

    static ArrayList<String> getAllSubSequence(String str){
        // Brake / TC
        if(str.length() == 0){
            // Create ArrayList which return a Blank String
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        // Small problem + Cycle
        // Get the first Character
        char firstChar = str.charAt(0); 
        ArrayList<String> tempResult = getAllSubSequence(str.substring(1));
        ArrayList<String> newResult = new ArrayList<>();
        for(int i = 0 ; i<tempResult.size(); i++){
                newResult.add(tempResult.get(i));
                newResult.add(firstChar + tempResult.get(i)  );
            }   
         
        return newResult; 
    }
    public static void main(String[] args) {
        ArrayList<String> result = getAllSubSequence("amit");
        System.out.println(result);
    }
}
