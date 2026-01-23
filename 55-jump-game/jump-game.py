class Solution:
    
    def canJump(self, nums: List[int]) -> bool:
        n = len(nums)
        if n ==1:
            return True
        dp = [0] * n
        for i in range(n):
            dp[i] = min(n-1, i + nums[i])

        print(dp)
        i = 0
        farthest = 0
        while i<=farthest:
            farthest = max(farthest, dp[i])
            if farthest >= n-1:
                return True
            i+=1
    

        return False