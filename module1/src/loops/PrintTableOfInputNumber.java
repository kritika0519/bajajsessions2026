package loops;
import java.util.*;

public class PrintTableOfInputNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number to print a table: ");
        int num=sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);

        }
        sc.close();
    }
}
