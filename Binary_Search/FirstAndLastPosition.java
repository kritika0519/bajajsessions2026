class Solution {
        public int[] searchRange(int[] arr, int target) {
            int[] res = { -1, -1 };

            int lo = 0;
            int hi = arr.length - 1;
            // check element is present or not
            boolean flag = false;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (arr[mid] == target) {
                    flag = true;
                    break;
                } else if (arr[mid] > target)
                    hi = mid - 1;
                else
                    lo = mid + 1;
            }
            if (flag == false)
                return res;

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
            res[0] = lb;

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
            res[1] = ub;

            return res;
        }
    }