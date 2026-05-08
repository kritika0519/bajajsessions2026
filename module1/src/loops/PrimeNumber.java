package loops;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=7;
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("composite number");
                break;

            }
            else if(n%i!=0){
                System.out.println("prime numbers");
                break;
            }
        }
    }
}
