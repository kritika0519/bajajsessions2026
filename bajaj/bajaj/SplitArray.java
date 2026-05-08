public class SplitArray {
    public static boolean canSplit(int[] nums) {
        int sum = 0;
        for(int n: nums) sum += n;
        if(sum % 2 != 0) return false;
        int target = sum / 2;
        int curr = 0;
        for(int n: nums) {
            curr += n;
            if(curr == target) return true;
        }
        return false;
    }
}
