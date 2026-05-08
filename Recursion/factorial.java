//package Recursion;

public class factorial {
    public static int fact (int num){
        if(num == 0 || num == 1){
            return 1;
        }
        //recursion store value in stack
        int ans= num * fact(num-1);
        return ans;
        
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println(fact(num));
    }
}
