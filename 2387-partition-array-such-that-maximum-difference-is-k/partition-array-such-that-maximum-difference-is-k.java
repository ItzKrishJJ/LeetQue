class Solution {
    public int partitionArray(int[] nums, int k) {
        int n = nums.length;
        int ans = 1;
        Arrays.sort(nums);
        int rec = nums[0];
        for(int i=0;i<n;i++)
        {
            if(nums[i]-rec > k)
            {
                ans++;
                rec = nums[i];
            }
        }
        return ans;
    }
}