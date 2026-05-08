package arraysQues;

import java.util.*;

public class ArraySortFunction {
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

        //sort array
        Arrays.sort(arr);

        //print sorted array
        System.out.print("sorted array is: ");
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
