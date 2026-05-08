package arraysQues;

public class NextGreatestElement {

    public static void main(String[] args) {
        int[] arr={12,8,41,37,2,49,16,28,21};
        //int[] arr = {25, 64, 49, 38, 26, 6};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nextGreatest(arr, i+1);
        }
        //last element=-1
        arr[arr.length-1]=-1;

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

    //greatest element
    public static int nextGreatest(int[] arr, int index) {
        int greatest = Integer.MIN_VALUE;
        for (int i = index; i < arr.length; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];

            }
        }
        return greatest;
    }

}
