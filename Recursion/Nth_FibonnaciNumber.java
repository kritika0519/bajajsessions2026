import java.util.Scanner;
public class Nth_FibonnaciNumber {
    public static int fibonnaci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonnaci(n-1)+fibonnaci(n-2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:- ");
        int num=sc.nextInt();
        System.out.println(fibonnaci(num));
    }
}
