//package arraysQues;

public class RemoveDuplicacy {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,5,5,6};

        int newLength=removeDup(arr);

        System.out.print("unique array: ");
        for(int i=0;i<newLength;i++){
            System.out.print(arr[i]+" ");
        }
    
    }
    public static int removeDup(int[] arr){
        int a=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[a]){
                a++;
                arr[a]=arr[i];
            }
        }
        return a+1;
    }

    

}
