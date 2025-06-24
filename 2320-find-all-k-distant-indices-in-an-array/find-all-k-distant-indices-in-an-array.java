class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int r = 0;
        int n = nums.length;
        List<Integer> l1 = new ArrayList<>();
        for(int j=0;j<n;j++)
        {
            if(nums[j]==key)
            {
                int l = Math.max(r, j-k);
                r = Math.min(n-1, j+k)+1;
                for(int i=l;i<r;i++)
                {
                    l1.add(i);
                }
            }
        }
        return l1;
    }
}