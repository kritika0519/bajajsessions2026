public class VariableSizeSlidingWindow {
    public static int longestSubarrayWithSumK(int[] nums, int k) {
        int left = 0, right = 0, sum = 0, maxLen = 0;
        while (right < nums.length) {
            sum += nums[right];
            while (sum > k && left <= right) sum -= nums[left++];
            if (sum == k) maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
