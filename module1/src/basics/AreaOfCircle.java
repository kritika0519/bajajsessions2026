package basics;
import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter radius of circle:-");
        double radius=sc.nextDouble();
        double pi=3.1415;

        double area=pi*radius*radius;

        System.out.println("area of circle is :"+area);
        sc.close();

    }
}
