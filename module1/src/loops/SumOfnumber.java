package loops;

public class SumOfnumber {
    public static void main(String[] args) {
        int n=123456;
        int sum=0;
        while(n>0){
            int num=n%10;
            sum+=num;
            n/=10;
        }
        System.out.println(sum);
    }
}
