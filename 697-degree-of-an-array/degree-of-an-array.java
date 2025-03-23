class Solution {
    public int findShortestSubArray(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int num = nums[i];
            if(left.get(num)==null)
            {
                left.put(num, i);
            }
            right.put(num, i);
            count.put(num, count.getOrDefault(num,0)+1);
        }
        int res = n;
        int degree = Collections.max(count.values());
        for(int num : count.keySet())
        {
            if(count.get(num)==degree){
                res = Math.min(res,right.get(num) - left.get(num) + 1);
            }
        }
        return res;


    }
}