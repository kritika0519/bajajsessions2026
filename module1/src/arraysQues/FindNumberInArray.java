package arraysQues;

import java.util.Scanner;

public class FindNumberInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //size
        System.out.println("enter the size of the array: ");
        int size=sc.nextInt();

        //array input
        int[] arr=new int[size];
        System.out.print("enter the elements of array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        //array print
        System.out.print("your array is: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        System.out.print("enter number to find in array: ");
        int find=sc.nextInt();

        boolean f=false;
        int ind=0;

        for(int i=0;i<size;i++){
            
            if(arr[i]==find){
                f=true;
                ind=i;
                break;
            }
            
        }
        
        if(f==true){
            System.out.println("number fount at index: "+ind);
        }
        else{
            System.out.println("number not found");
        }

    }
}
