//package MultiDimentionArray;

public class TransposeOfMatrix {

    public static void main(String[] args) {
        int[][] arr = {{25, 65}, {64, 58}, {18, 24}};
        int m = arr.length;
        int n = arr[0].length;
//new array
        int[][] res = new int[n][m];

//storing value of arr(m*n) in res(n*m)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j]=arr[j][i];
            }
        }

//printing of "res" array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
