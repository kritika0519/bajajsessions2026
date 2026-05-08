package loops;
import java.util.*;

public class GP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("value of a: ");
        int a=sc.nextInt();
        System.out.println("value of r: ");
        int r=sc.nextInt();
        System.out.println("value of n: ");
        int n=sc.nextInt();

        for(int i=a;i<=n;i*=r){
            System.out.print(i+" ");
        }
    }
}
