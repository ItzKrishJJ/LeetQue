class Solution:
    def longestPalindrome(self, s: str) -> str:
        n =  len(s)
        if not s: 
            return ""
        maxlen = 1
        start = 0

        def expand_around_center(left : int, right : int) -> None:
            nonlocal maxlen , start
            while(left>=0 and right<n and s[left]==s[right]):
                if right - left + 1 > maxlen:
                    start = left
                    maxlen = right - left + 1
                left -=1
                right +=1
        
        for i in range(n):
            # check even palindrome
            expand_around_center(i,i)

            # check odd palindrome
            expand_around_center(i,i + 1)
        
        return s[start: start+ maxlen]