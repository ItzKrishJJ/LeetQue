class Solution {
    public int countHillValley(int[] nums) {
        int prev = 0;
        int count = 0;
        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                if((nums[i]>nums[prev] && nums[i]>nums[i+1]) || (nums[i]<nums[prev] && nums[i]<nums[i+1]))
                {
                    count++;
                }
                prev = i;
            }
        }
        return count;
    }
}