class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int no : nums)
        {
            mp.put(no,mp.getOrDefault(no,0)+1);
        }

        int res = 0;
        for(int no : nums)
        {
            if(mp.get(no)>1)
            {
                res = no;
                return res;
            }
        }
        return res;
    }
}