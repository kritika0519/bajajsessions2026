//package Binary_Search;
//It finds the first index where the number is equal to or bigger than your target.

public class Lower_bound {
    public static void main(String[] args) {
        // lower bound
        int[] arr = { 1, 5, 10, 24, 35, 48, 59, 65, 74, 86 };
        int target = 60;
        int lo = 0;
        int hi = arr.length - 1;

        int lb = arr.length;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= target) {
                lb = Math.min(lb, mid);
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println(lb);
    }
}
/*
  // lower bound
            int lb = arr.length;
            lo = 0;
            hi = arr.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (arr[mid] >= target) {
                    lb = Math.min(lb, mid);
                    hi = mid - 1;
                } else
                    lo = mid + 1;
            }


    // upper bound
            int ub = -1;
            lo = 0;
            hi = arr.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (arr[mid] <= target) {
                    if (arr[mid] == target)
                        ub = mid;
                    lo = mid + 1;
                } else
                    hi = mid - 1;
            }
 */