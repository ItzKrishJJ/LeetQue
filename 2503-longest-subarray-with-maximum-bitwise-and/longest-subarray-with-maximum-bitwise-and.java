class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0, streak = 0, maxval = 0;
        for(int num : nums)
        {
            if(maxval<num)
            {
                maxval  = num;
                ans = streak = 0;
            }

            if(maxval==num)
            {
                streak++;
            }
            else{
                streak = 0;
            }

            ans = Math.max(ans,streak);
        }
        return ans;
    }
}