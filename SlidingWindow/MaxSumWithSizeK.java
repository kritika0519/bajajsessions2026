class MaxSumWithSizeK {
    public static void main(String[] args) {
        int[] arr = { 10, 50, 1, 3, -40, 10, 3 };
        int k = 3;
        int n= arr.length;
        int max=0;
        for(int i=0;i<=n-k;i++){
            int sum=0;
            for(int j=i;j<=i+k-1;j++){
                sum+=arr[j];
            }
            max= Math.max(max, sum);
        }
        
         System.out.println(max);
    }
}