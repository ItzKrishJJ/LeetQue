class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        helper(0, nums, list, new ArrayList<>());
        return list;
    }
    private void helper(int ind, int[] nums,List<List<Integer>> list, List<Integer> ds)
    {
       list.add(new ArrayList<>(ds));

        for(int i = ind; i < nums.length;i++)
        {
            if(i > ind && nums[i]==nums[i-1])
            {
                continue;
            }

            ds.add(nums[i]);
            helper(i+1, nums, list ,ds);
            ds.remove(ds.size()-1);
        }

    }
}