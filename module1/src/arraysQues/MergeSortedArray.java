package arraysQues;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr={2,5,8,9};
        int a=arr.length;
        int[] brr={1,3,4,6,7};
        int b=brr.length;
        int[] crr=new int[a+b];

        int i=0;
        int j=0;
        int k=0;
        
        while(i<a && j<b){
            if(arr[i]<brr[j]){
                crr[k]=arr[i];
                i++;
                k++;
            }
            else if(arr[i]>brr[j]){
                crr[k]=brr[j];
                j++;
                k++;
            }
            
            else if(arr[i]==brr[j]){
                crr[k]=arr[i];
                crr[k+1]=arr[i];
                i++;
                j++;
                k+=2;
            }
        }


    for(int x:crr){
        System.out.print(x+" ");
    }


    }
}
