package Binary_Search;

public class Basic {
    public static void main(String[] args) {
        int[] arr={10,20,35,42,86,87,90};
        int target=86;
        int a=0;
        int b=arr.length-1;

        while(b>=a){
            int mid=a+(b-a)/2;
            if(arr[mid]<target){
                a=mid+1;
            }
            else if(arr[mid]>target){
                b=mid-1;
            }
            else if(arr[mid]==target){
                System.out.println("element found at index "+mid);
                break;
            }
        }
    }
}
