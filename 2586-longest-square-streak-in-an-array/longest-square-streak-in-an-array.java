import java.util.Arrays;

class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        int ans = -1;

        for (int i = 0; i < nums.length; i++) {
            long x = nums[i];
            long pwr = x * x;
            if (binarySearch(nums, 0, n, pwr)) {
                int len = 1;
                while (binarySearch(nums, 0, n, pwr)) {
                    len++;
                    pwr = pwr * pwr;
                }
                ans = Math.max(ans, len);
            }
        }
        return ans;
    }

    private boolean binarySearch(int nums[], int low, int high, long pwr) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == pwr) { // Corrected this line to compare nums[mid] with pwr
                return true;
            } else if (nums[mid] < pwr) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
