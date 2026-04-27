class Solution:
    def slowestKey(self, releaseTimes: List[int], keysPressed: str) -> str:
        diff = releaseTimes[0]
        ans = keysPressed[0]
        n = len(releaseTimes)

        for i in range(1, n):
            sub = releaseTimes[i] - releaseTimes[i-1]
            if (sub>diff) or (sub == diff and keysPressed[i] > ans):
                diff = sub
                ans = keysPressed[i]
        return ans