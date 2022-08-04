class Print1to10{

    static void show(int num){
        if(num ==11){
            return;
        }
        System.out.println(num);
        show(num+1); // Make a Cycle
    }
    public static void main(String[] args) {
        show(1);
    }
}