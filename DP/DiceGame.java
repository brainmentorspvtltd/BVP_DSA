import java.util.ArrayList;

public class DiceGame {

    static ArrayList<String> countWays(int currentVal, int endValue) {
        if(currentVal == endValue) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        if(currentVal > endValue) {
            ArrayList<String> temp = new ArrayList<>();
            return temp;
        }

        ArrayList<String> temp = new ArrayList<>();
        for(int dice = 1; dice <= 6; dice++) {
            int newValue = dice + currentVal;
            ArrayList<String> res= countWays(newValue, endValue);
            for(String s : res) {
                temp.add(dice+s);
            }
        }
        return temp;
    }

    static int countWays_2(int currentVal, int endValue) {
        if(currentVal == endValue) {
            return 1;
        }
        if(currentVal > endValue) {
            return 0;
        }

        int count = 0;
        for(int dice = 1; dice <= 6; dice++) {
            int newValue = dice + currentVal;
            count = count + countWays_2(newValue, endValue);
        }
        return count;
    }

    static int memoization(int currentVal, int cache[]) {
        if(currentVal == endValue) {
            return 1;
        }
        if(currentVal > endValue) {
            return 0;
        }
        if(cache[currentVal] != 0) {
            return cache[currentVal];
        }
        int count = 0;
        for(int dice = 1; dice <= 6; dice++) {
            int newValue = dice + currentVal;
            count = count + countWays_2(newValue, endValue);
        }
        cache[currentVal] = count;
        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        int current = 0;
        System.out.println(countWays(current, n));
    }
}
