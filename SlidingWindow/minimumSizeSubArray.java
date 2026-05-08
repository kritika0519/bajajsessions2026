public class minimumSizeSubArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 4, 3 };
        int target = 7;

        int ans = Integer.MAX_VALUE;
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum >= target) {
                    ans = Math.min(ans, j-i+1);
                    break;
                }
                
            }
        }
        System.out.println(ans);
        
    }
}
