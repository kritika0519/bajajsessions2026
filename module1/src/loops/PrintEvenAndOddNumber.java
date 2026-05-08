package loops;
import java.util.*;
public class PrintEvenAndOddNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number till we want segregation: ");
        int num=sc.nextInt();
        System.out.print("even number: ");
        for(int i=0;i<=num;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.print("odd number: ");
        for(int i=0;i<=num;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }

        sc.close();

    }
}
