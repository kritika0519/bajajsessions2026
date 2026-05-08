package arraysQues;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,7,9,7,-1,10};
        int sum=9;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
