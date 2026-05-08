// package MultiDimentionArray;

public class AddTwoMatrices {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] brr = {{25,65,75},{8,64,58},{8,65,24},{9,63,48}};

        int[][] crr = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                    crr[i][j]= arr[i][j]+brr[i][j];
            }
        }
      

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(crr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
