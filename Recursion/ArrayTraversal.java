public class ArrayTraversal {
    static int a=0;
    public static void print(int n,int[] arr){
        if(n==-1)   return;
        print(n-1,arr);
        System.out.print(arr[n]+" ");
    }
    public static void main(String[] args) {
        int[] arr={4,2,6,3,1,5,8};
        print(arr.length-1,arr);
    }
}
