// shifting the smallest number to its index from starting by swapping
// it is unstable
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 3,2, 1, 4};

        for (int i = 0; i <arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex=j;
                }
            }
            //swapping 
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
// print array
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
