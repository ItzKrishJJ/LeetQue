class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        int subsets = 1 << n;
        for(int mask= 0; mask<subsets;mask++)
        {
            List<Integer> l1 = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                if((mask & (1<<i))!=0)
                {
                    l1.add(nums[i]);
                }
            }
            list.add(l1);
        }
        return list;
    }
}