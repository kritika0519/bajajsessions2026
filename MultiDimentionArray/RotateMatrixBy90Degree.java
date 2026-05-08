//package MultiDimentionArray;

// public class RotateMatrixBy90Degree {
//     public static void main(String[] args) {
//         int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
//         // int m=arr.length;
//         // int n=arr[0].length;
//         System.out.println("your matrix is: ");
//         print(arr);
//         System.out.println("transpose matrix : ");
//         int[][]res = Transpose(arr);
//         print(res);


        
//             for(int i=0;i<res.length;i++){
//                 int a=0;
//                 int b=res[i].length-1;
//                 while(a<b){
//                     int temp=res[i][a];
//                     res[i][a]=res[i][b];
//                     res[i][b]=temp;
//                     a++;
//                     b--;
//                 }
//             }
            
//         System.out.println("rotated matrix is: ");
//         print(res);
//     }   


//     public static int[][] Transpose(int[][] arr) {
//         int[][] res=new int[arr[0].length][arr.length];

//         for(int i=0;i<arr[0].length;i++){
//             for(int j=0;j<arr.length;j++){
//                 res[i][j]=arr[j][i];
//             }
//         }
//         return res;
//     }

    

//     public static void print(int[][] arr) {
//         for (int i = 0; i <arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 System.out.print(arr[i][j]+"\t");
//             }
//             System.out.println();
//         }
//     }


// }


class Solution {
    public void rotate(int[][] arr) {
    //transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

    //reverse each rows
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr[i].length - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
 