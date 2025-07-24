class Solution {
    public boolean canJump(int[] nums) {
        int maxjump = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(maxjump>=i)
            {
                maxjump = Math.max(maxjump , i+nums[i]);
            }
            else{
                return false;
            }
        }
        return true;
    }
}