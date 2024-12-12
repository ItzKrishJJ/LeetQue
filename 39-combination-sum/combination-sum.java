class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        helper(0,candidates.length, candidates,target, list,new ArrayList<>());
        return list;
    }
    private void helper(int index,int n, int[] candidates, int target, List<List<Integer>> list, List<Integer> l1)
    {
      
        if(target==0)
            {
            list.add(new ArrayList<>(l1));
            return;
            }
        if(index>=n || target<0)
        {
            return;
        }
        if(candidates[index]<= target)
        {
            l1.add(candidates[index]);
            helper(index,n,candidates,target - candidates[index], list,l1);
            l1.remove(l1.size()-1);
        }
        helper(index+1, n , candidates, target, list,l1);
        
    }
}