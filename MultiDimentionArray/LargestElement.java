package MultiDimentionArray;

public class LargestElement {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
            }
        }
        System.out.println(largest);
    }
    
}
