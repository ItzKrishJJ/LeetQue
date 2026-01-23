class Solution:
    def jump(self, nums: List[int]) -> int:
        n = len(nums)
        if n<=1:
            return 0
        
        steps = 0
        jump = 0
        currjump = 0
        for i in range(n-1):
            currjump  = max(currjump , nums[i] + i)
            if i == jump:
                jump = currjump
                steps+=1

                # if jump >= n-1:
                #     break




        return steps

