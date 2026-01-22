class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        charcount = [0]*26
        n = len(s)
        res = []

        for i in range(n):
            charcount[ord(s[i]) - ord('a')] = i

        print(charcount)
        start =end =0
        for i in range(n):
            end = max(end, charcount[ord(s[i]) - ord('a')])
            if end==i:
                res.append(i - start+1)
                start = i +1
        
        return res

        