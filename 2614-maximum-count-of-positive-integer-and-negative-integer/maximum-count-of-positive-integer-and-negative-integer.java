import java.util.Arrays;

class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        if (nums[0] > 0) {
            return n;
        }

        int start = 0;
        int end = n - 1;
        int pos = n;  // Default to n in case no positive numbers exist
        int neg = 0;

        // Binary search to find the first positive number
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > 0) {
                pos = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        int zeroIndex = 0;
        while (zeroIndex < n && nums[zeroIndex] < 0) {
            zeroIndex++;
        }
        neg = zeroIndex;
        return Math.max(n - pos, neg);
    }
}
