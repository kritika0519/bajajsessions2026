package MultiDimentionArray;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int row=sc.nextInt();
        System.out.print("enter number of columns: ");
        int column=sc.nextInt();
//declare 2d array
        int[][] arr =new int[row][column];

        
// input 2d array
        System.out.println("enter your array:- ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }

//print 2d array
System.out.println("Your Array is:- ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
