package arraysQues;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr={5,63,78,24,93,21};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
