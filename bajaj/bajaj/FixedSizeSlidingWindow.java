public class FixedSizeSlidingWindow {
    public static int maxSum(int[] arr, int k) {
        int maxSum = 0, sum = 0;
        for (int i = 0; i < k && i < arr.length; i++) sum += arr[i];
        maxSum = sum;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
