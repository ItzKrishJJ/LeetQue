class Solution {
    public int waysToSplitArray(int[] nums) {
        long totalsum = 0;
        int partition = 0;
        for(int num: nums)
        {
            totalsum +=num;
        }   
        long currsum = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            currsum = currsum + nums[i];
            long diff = totalsum - currsum;
            if(diff<=currsum)
            {
                partition++;
            }
        }
        return partition;
    }
}