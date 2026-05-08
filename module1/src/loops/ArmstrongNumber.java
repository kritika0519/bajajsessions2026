package loops;

public class ArmstrongNumber {
    
    public static void main(String[] args) {
        //153 is armstrong number
        
        int n=153;
        int original=n;
        int count=0; 
        //counting numbers of digit
        while(n>0){
            n/=10;
            count++;
        }
        int sum=0;
        n=original;
        //armstrong
        while(n>0){
            int num=n%10;
            sum+=Math.pow(num,count);
            n/=10;
        }
        //System.out.println(sum);
        if(sum==original){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("not an Armstrong Number");
        }
    }
}
