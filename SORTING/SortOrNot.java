public class SortOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        int size = arr.length;
        boolean sort = true; 
 
        for (int i = 1; i < size; i++) {
            if (arr[i] < arr[i - 1]) {
                sort = false;
                break;
            }
        }
 
        if (sort) {
            System.out.println("sorted");
        } else {
            System.out.println("unsorted");
        }
    }
 }
 