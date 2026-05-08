package arraysQues;

import java.util.Scanner;

public class PassingArrayInMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //size
        System.out.print("enter the size of the array: ");
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

        System.out.println("Maximum element is: "+max(arr));
        System.out.println("Minimum element is: "+min(arr));

    }
    public static int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }

    public static int min(int[] arr) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
        }
        return min;
    }
}
