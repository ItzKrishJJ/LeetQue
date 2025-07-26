class Solution {
    public int maxSum(int[] nums) {
        int poscount = 0;
        int negmax = Integer.MIN_VALUE;
        int zerocount = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num : nums)
        {
            if(num>0)
            { 
                poscount++;
                mp.put(num, 1);
            }
            else if(num<0 && num>negmax)
            {
                negmax = num;
            }
            else if(num==0) {
                zerocount++;
            }

        }
        int sum = 0;
        if(zerocount>0 && poscount==0) return 0;
        if(poscount==0) {return negmax;}
        else{
            for(int num : mp.keySet())
            {
                sum+=num;
            }
        }
        return sum;
    }
}