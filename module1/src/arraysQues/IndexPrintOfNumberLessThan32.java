package arraysQues;

public class IndexPrintOfNumberLessThan32 {
    public static void main(String[] args) {
        int[] arr={32,67,26,98,76,42,34};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=35){
                System.out.print(i+" ");
            }
        }
    }
}
