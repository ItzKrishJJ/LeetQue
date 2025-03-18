class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num: nums)
        {
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        
        for(int num: nums)
        {
            if(mp.get(num)%2!=0)
            {
                return false;
            }
        }
        return true;
    }
}