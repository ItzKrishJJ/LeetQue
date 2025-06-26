class Solution {
    public int robhouse(int[] nums) {
        

        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        int dp[] = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++)
        {
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        return dp[n-1];

    }
    public int rob(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        int n = nums.length;
        if(n==1) return nums[0];
        for(int i=0;i<n;i++)
        {
            if(i!=0) arr1.add(nums[i]);
            if(i!=n-1) arr2.add(nums[i]);
        }

           // Convert List<Integer> to int[]
        int[] a1 = arr1.stream().mapToInt(i -> i).toArray();
        int[] a2 = arr2.stream().mapToInt(i -> i).toArray();
        return Math.max(robhouse(a2), robhouse(a1));
    }
}