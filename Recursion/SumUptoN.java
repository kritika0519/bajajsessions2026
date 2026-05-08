// find sum of number upto n
public class SumUptoN {
    public static int sum(int n){
        if(n==0) return 0;//base
        return n+sum(n-1);// return (work & (call))
    }
    public static void main(String[] args) {
        int num=10;
        System.out.println(sum(num));
    }
}
