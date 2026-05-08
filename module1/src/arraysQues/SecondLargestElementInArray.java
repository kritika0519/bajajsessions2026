package arraysQues;

import java.util.Scanner;

public class SecondLargestElementInArray {
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

        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            max=Math.max(max,arr[i]);
        }

        int SecMax=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]>SecMax && arr[i]!=max){
                SecMax=arr[i];
            }
        }
        System.out.println("second largest elemnt is :"+SecMax);
    }
}
