class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int num : nums)
        {
            minheap.add(num);
        }
        int opr = 0;
        while(opr<k)
        {
            int min = minheap.poll();
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==min)
                {
                    nums[j]= nums[j] * multiplier;
                    minheap.add(nums[j]);
                    break;
                }
                
            }
            opr++;
        }
        return nums;
    }
}