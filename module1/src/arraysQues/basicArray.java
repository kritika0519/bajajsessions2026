package arraysQues;

import java.util.*;

public class basicArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int size=sc.nextInt();
        int[] arr = new int[size];

        //input an array
        System.out.print("input array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        //output an array
        System.out.print("Print array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
         
    }
}
