class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp1 = 0;
        int dp2 = 0;
        for(int i=cost.length-1;i>=0;i--)
        {
            int curr = cost[i]+Math.min(dp1,dp2);
            dp2 = dp1;
            dp1 = curr;

        }
        return Math.min(dp1,dp2);
    }
}