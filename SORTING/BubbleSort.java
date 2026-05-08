// shifting largest element to the last by swapping
public class BubbleSort {

    public static void print(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 3, 6, 4, 2 };

        // for (int i = 0; i < arr.length - 1; i++) {
        //     for (int j = 0; j < arr.length - i - 1; j++) {
        //         if (arr[j + 1] < arr[j]) {
        //             int temp = arr[j + 1];
        //             arr[j + 1] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }


// more optimised by uusing boolean flag
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwap=false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSwap=true;
                }
            }

            if(!isSwap){
                break;
            }
        }
        print(arr);
    }
}
