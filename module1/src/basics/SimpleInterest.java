package basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the principle amount:- ");
        double p=sc.nextDouble();
        System.out.print("enter rate of interest:- ");
        double r=sc.nextDouble();
        System.out.print("enter the time period:- ");
        double t=sc.nextDouble();

        double si = (p*r*t)/100;

        System.out.println("simple interest is "+si);

        sc.close();

    }
}
