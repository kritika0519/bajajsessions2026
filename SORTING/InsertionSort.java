
public class InsertionSort {

    public static void print(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2,6,4,3,1,8,3};
        int count=0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    count++;
                }
                else break;
            }
        }

        print(arr);
        System.out.println("number of swap= "+count);
    }

}
