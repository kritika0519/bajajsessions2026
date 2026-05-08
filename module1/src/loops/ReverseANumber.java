package loops;

public class ReverseANumber {
    public static void main(String[] args) {
        int n=5187;
        int reverse=0;
        while(n>0){
            int r=n%10;
            reverse=reverse*10+r;
            n/=10;
        }
        System.out.println(reverse);
    }
}
