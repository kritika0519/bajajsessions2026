package arraysQues;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,8,5,9,7};
        reverse(arr);

        for(int x:arr){
            System.out.print(x+" ");
        }

    }

    // public static void reverse(int[] arr){
    //     int size=arr.length-1;
    //     for(int i=0;i<arr.length/2;i++){
    //         int temp=arr[i];
    //         arr[i]=arr[size-i];
    //         arr[size-i]=temp;
    //     }
        
    // }

    public static void reverse(int[] arr){
        int size=arr.length-1;
        int i=0;
        int j=size;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[size-i];
            arr[size-i]=temp;
            i++;
            j--;
        }
    }
}
