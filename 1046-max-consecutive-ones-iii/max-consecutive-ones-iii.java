class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeros = 0;
        int n = nums.length;
        int left = 0, right = 0;
        int maxLen = 0;
        while(right < n)
        {
            if(nums[right]==0)
            {
                zeros++;
            }
            while(nums[right]==0 && zeros>k)
            {
                if(nums[left]==0)
                {
                    zeros--;
                }
                left++;
            }
            
            if(zeros<=k)
            {
            int len = right - left +1;
            maxLen = Math.max(len, maxLen);
            }
            right++;
        }
        return maxLen;
    }
}