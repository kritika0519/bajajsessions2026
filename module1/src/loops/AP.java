package loops;
import java.util.*;

public class AP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("value of a: ");
        int a=sc.nextInt();
        System.out.println("value of d: ");
        int d=sc.nextInt();
        System.out.println("value of n: ");
        int n=sc.nextInt();

        for(int i=a;i<=n;i+=d){
            System.out.print(i+" ");
        }
    }
}
