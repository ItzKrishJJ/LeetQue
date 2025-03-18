class Solution {
    public int longestNiceSubarray(int[] nums) {
        int len = 0;
        int left = 0, orSum = 0;
        
        for (int right = 0; right < nums.length; right++) {
            while ((orSum & nums[right]) != 0) {
                orSum ^= nums[left];
                left++;
            }
            orSum |= nums[right];
            len = Math.max(len, right - left + 1);
        }
        
        return len;
    }
}
