package arraysQues;

public class SortArrayOf0and1 {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,0,1,0,0,1,1};
        // Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
