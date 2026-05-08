package basics;

import java.util.*;

public class DataTypes {
    public static void main(String[] args) {
        // Variables are used to store data in a program.
         Scanner sc = new Scanner(System.in);
        //string
        System.out.println("enter your name:- ");
        String name=sc.nextLine();
        System.out.println("your name is "+name);

        //int
        System.out.println("enter your age:-");
        int age=sc.nextInt();
        System.out.println("your age is "+age);

        //double
        System.out.println("enter your height:-");
        double height = sc.nextDouble();
        System.out.println("your height is "+height);

        //char
        System.out.println("enter your cast initial:- ");
        char cast = sc.next().charAt(0);
        System.out.println("your cast initial is "+cast);

         sc.close();
    }
}
