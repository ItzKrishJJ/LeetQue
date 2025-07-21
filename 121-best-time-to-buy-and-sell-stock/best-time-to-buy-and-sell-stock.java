class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[] = new int[n];
        dp[0] = prices[0];
        int max = 0;
        for(int i=1;i<n;i++)
        {
            if(prices[i]<dp[i-1])
            {
                dp[i]= prices[i];
            }
            else {
                dp[i] = dp[i-1];
            }

            max = Math.max(max, prices[i]-dp[i-1]);
        }
        return max;
    }
}