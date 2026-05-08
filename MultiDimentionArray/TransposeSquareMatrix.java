package MultiDimentionArray;
//without using extra matrix
//only possible for square matrix
public class TransposeSquareMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length;
        TransposeSquare(arr,m);


        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
    public static void TransposeSquare(int[][] arr,int m) {
        

        for (int i = 0; i < m; i++) {
            for (int j = i+1; j < m; j++) {
            
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                
            }
        }

    }
}
