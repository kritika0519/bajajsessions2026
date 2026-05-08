package arraysQues;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int last=arr.length-1;
        int n=2;

        reverse(arr,0,last);
        reverse(arr,0,n-1);
        reverse(arr,n,last);


        //print array
        for(int x:arr){
            System.out.print(x+" ");
        }


    }
    public static void reverse(int[] arr,int i,int j){
       
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
