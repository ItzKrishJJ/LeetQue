class Solution:
    def maxSum(self, nums: list[int], k: int, mul: int) -> int:
        total_sum = 0
        nums.sort(reverse= True)
        for i in range(k):
            if mul>0:
                total_sum+=(nums[i]*mul)
                mul-=1
            else:
                total_sum+=(nums[i]+mul)
        return total_sum