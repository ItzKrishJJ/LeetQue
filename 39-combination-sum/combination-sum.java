class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, 0,candidates, ans, new ArrayList<>(), target);
        return ans;
    }
    public void helper(int ind, int sum,int[] candidates, List<List<Integer>> ans, List<Integer> l1, int target )
    {
        if(sum==target)
        {
            ans.add(new ArrayList<>(l1));
            return;
        }
        if(sum>target || ind==candidates.length)
        {
            return;
        }
        l1.add(candidates[ind]);
        helper(ind, sum+candidates[ind], candidates, ans,l1,target);
        l1.remove(l1.size()-1);
        helper(ind+1,sum,candidates,ans,l1,target);
    }
}