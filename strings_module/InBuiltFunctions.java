package strings_module;

import java.util.Scanner;
public class InBuiltFunctions {
 public static void main(String[] args){
    // Scanner sc=new Scanner(System.in);
    // String str=sc.nextLine();
    String str="Hello My Name Is Kartikeya Jain";
    System.out.println("your string is : "+ str);
    //finding character using charAt();
    System.out.println("char at index 5: "+str.charAt(5));
    //finding index of char in String using IndexOf()
    System.out.println("finding index of char r: "+str.indexOf('r'));
    //finding length of tring
    System.out.println("finding length of string: "+str.length());
    //string to lower case
    System.out.println("String in lower case: "+str.toLowerCase());
    //string in upper case
    System.out.println("String in upper case: "+str.toUpperCase());
    //contains function
    System.out.println("contains function: "+str.contains("Is"));
    

 }   
}
