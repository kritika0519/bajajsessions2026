//package loops;
import java.util.*;
public class validTriangle {
    public static void main(String[] args) {
        int []arr={2 ,1,2};
        Arrays.sort(arr);
        if(arr[0]+arr[1]>arr[2]){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
