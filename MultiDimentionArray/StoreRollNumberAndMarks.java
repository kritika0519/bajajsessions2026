package MultiDimentionArray;

import java.util.*;
public class StoreRollNumberAndMarks {

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print ("enter number of students: ");
    int s = sc.nextInt();
    int[][] arr = new int[2][s];

    for(int i=0;i<s;i++){
         System.out.println("enter roll number: ");
         
             arr[0][i]=sc.nextInt();      
         
         System.out.println("enter marks obtained: ");
         
             arr[1][i]=sc.nextInt();
         
    }

    for(int i=0;i<s;i++){
        
        System.out.println(arr[0][i]+" \t"+ arr[1][i]);
        
    }
   }}
