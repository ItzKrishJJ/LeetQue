class Solution {
    public boolean isArraySpecial(int[] nums) {
        int bit = nums[0]%2==0 ? 0 : 1;
        for(int i=0;i<nums.length;i++)
        {
            if(bit==0 && nums[i]%2==0)
            {
                bit = 1;
            }
            else if(bit==1 && nums[i]%2==1)
            {
                bit = 0;
            }
            else{
                return false;
            }
        }
        return true;
    }
}