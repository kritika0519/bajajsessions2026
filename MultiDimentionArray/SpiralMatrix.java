//package MultiDimentionArray;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int m = arr.length;
        int n = arr[0].length;
        System.out.println("original matrix:- ");
        print(arr);

        System.out.println("spiral matrix:- ");

        int minr = 0;
        int maxr = m - 1;
        int minc = 0;
        int maxc = n - 1;

        while (minr <= maxr && minc <= maxc) {
            //left -> right
            for (int j = minc; j <= maxc; j++) {
                System.out.print(arr[minr][j] + "\t");
            }
            minr++;

            //top -> bottom
            if (minr > maxr || minc > maxc) {
                break;
            }
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc] + "\t");
            }
            maxc--;

            //right -> left
            if (minr > maxr || minc > maxc) {
                break;
            }
            for (int j = maxc; j >= minc; j--) {
                System.out.print(arr[maxr][j] + "\t");
            }
            maxr--;

            //bottom -> top
            if (minr > maxr || minc > maxc) {
                break;
            }
            for (int i = maxr; i >= minr; i--) {
                System.out.print(arr[i][minc] + "\t");
            }
            minc++;

        }

       
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
