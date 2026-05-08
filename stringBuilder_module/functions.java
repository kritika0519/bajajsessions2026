package stringBuilder_module;

import java.util.Scanner;
public class functions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input
        StringBuilder sb=new StringBuilder(sc.nextLine());
        //length
        System.out.println("length:-"+sb.length());
        //append
        System.out.println("append:- "+sb.append('a'));
        
        //delete between index
        sb.delete(2, 4);
        System.out.println("delete between index:- "+sb);
        
        //delete Char at
        sb.deleteCharAt(3);
        System.out.println("delete char at index: "+sb);
        
        //insert at index
        sb.insert(2,"xyz");
        System.out.println("inserted at index:- "+ sb);

        //reverse string
        sb.reverse();
        System.out.println("reverse string:- "+sb);

        //setCharAt(index,char)
        sb.setCharAt(3,'a');
        System.out.println("setCharAt(index,char):- "+sb);
    }
}
