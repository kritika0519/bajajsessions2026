//find peak element
public class MountainArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int n=arr.length;
        int idx=-1;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                idx=mid;
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                lo=mid+1;
            }
            else hi=mid-1;
        }
        System.out.println(idx);
    }
}
