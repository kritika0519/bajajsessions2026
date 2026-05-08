public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        
        SearchInRotatedArray solution = new SearchInRotatedArray();
        int result = solution.search(arr, target);
        
        System.out.println("Array: [4, 5, 6, 7, 0, 1, 2]");
        System.out.println("Target: " + target);
        System.out.println("Found at index: " + result);
        
        
    }

    public int search(int[] nums, int target) {
        int a = 0, b = nums.length - 1;

        while (a <= b) {
            int mid = a + (b - a) / 2;

            if (nums[mid] == target) return mid;

            if (nums[a] <= nums[mid]) {
                if (nums[a] <= target && target < nums[mid]) {
                    b = mid - 1;
                } else {
                    a = mid + 1;
                }
            }
            else {
                if (nums[mid] < target && target <= nums[b]) {
                    a = mid + 1;
                } else {
                    b = mid - 1;
                }
            }
        }
        return -1;
    }


    
}

/*
 class Solution {
    public int search(int[] nums, int target) {
        int a = 0, b = nums.length - 1;

        while (a <= b) {
            int mid = a + (b - a) / 2;

            if (nums[mid] == target) return mid;

            if (nums[a] <= nums[mid]) {
                if (nums[a] <= target && target < nums[mid]) {
                    b = mid - 1;
                } else {
                    a = mid + 1;
                }
            }
            else {
                if (nums[mid] < target && target <= nums[b]) {
                    a = mid + 1;
                } else {
                    b = mid - 1;
                }
            }
        }
        return -1;
    }
}
 */
