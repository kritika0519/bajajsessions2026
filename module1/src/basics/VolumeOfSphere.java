package basics;

import java.util.*;
public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of sphere:- ");
        double radius=sc.nextDouble();
        double pi=3.1415;

        double volume=(4/3)*pi*radius*radius*radius;

        System.out.println("the volume of sphere with radius "+radius+" is "+volume);
        sc.close();
    }
}
