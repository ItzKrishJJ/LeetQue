
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(0, nums, list, new ArrayList<>());
        return list;
    }

    public void helper(int index, int nums[], List<List<Integer>> list, List<Integer> ds) {   
        list.add(new ArrayList<>(ds));

        for (int i = index; i < nums.length; i++) {
            ds.add(nums[i]); 
            helper(i + 1, nums, list, ds);
            ds.remove(ds.size() - 1); 
        }
    }
}
