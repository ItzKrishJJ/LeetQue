class Solution:
    def numOfStrings(self, patterns: List[str], word: str) -> int:
        ans = 0
        for substr in patterns:
            if substr in word:
                ans +=1
        return ans