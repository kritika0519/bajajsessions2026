package loops;
import java.util.*;

public class PrintUserInputNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
