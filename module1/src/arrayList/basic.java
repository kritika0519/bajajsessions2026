package arrayList;

import java.util.*;

public class basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //syntax
        ArrayList<Integer> arr = new ArrayList<>(6);
        /* Value Initialising */
        arr.add(0, 10);
        arr.add(1, 20);
        arr.add(2, 30);
        arr.add(3, 40);
        arr.add(4, 50);
        arr.add(5, 60);


        /*Printing ArrayList using loop */
        System.out.print("printing elements: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.print("size=" + arr.size());
        System.out.println();

        /*adding value */
        /*everytime no need to give index, it give value in the order */
        arr.add(675);


        /*Modify value at perticular index */
        arr.set(1, 250);
        arr.set(3, 500);

        /*Printing ArrayList */
        System.out.println("ArrayList:" + arr + " size:" + arr.size());

    }
}
