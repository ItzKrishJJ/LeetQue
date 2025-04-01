class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return count(nums, goal) - count(nums, goal - 1);
    }

    public int count(int nums[], int goal) {
        if (goal < 0) return 0;
        int r = 0, l = 0, sum = 0, cnt = 0;
        while (r < nums.length) {
            sum += nums[r];
            while (sum > goal) {
                sum -= nums[l];
                l++;
            }
            cnt += (r - l + 1); // Fixed incorrect subarray count
            r++;
        }
        return cnt;
    }
}
