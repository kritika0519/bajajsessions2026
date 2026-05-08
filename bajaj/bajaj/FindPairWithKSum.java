import java.util.*;

public class FindPairWithKSum {
    public static boolean hasPair(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == k) return true;
            if (sum < k) i++;
            else j--;
        }
        return false;
    }
}
