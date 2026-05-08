// brute force sliding window
public class maxSum {
    public static void main(String[] args) {
        //int[] arr= {1,2,3,4,1,2,5,2,4,3};
        int[] arr = { 10, 50, 1, 3, -40, 10, 3 };
        int k=3;
        // int Finalsum=0;
        // int left=0;
        // int right=k-1;
        //  while (right < arr.length){
        //     int sum=0;
        //     int curr=left;
        //     while(curr<=right){
        //          sum+=arr[curr];
        //          curr++;
        //     }
        //     Finalsum=Math.max(Finalsum, sum);
        //     left++;
        //     right++;
        // }

        // System.out.println(Finalsum);


        int sum=0;
        for(int i=0;i<k;i++) sum+=arr[i];

        int max=sum;
        for(int i=k;i<arr.length;i++){
            sum+= arr[i]-arr[i-k];
            max=Math.max(sum, max);
        }
        System.out.println(max);

    }
}
