class Solution:
    def partition(self, s: str) -> List[List[str]]:
        res = []
        l1 = []
        self.helper(0,s,res, l1)
        return res

    def helper(self, index:int, s:str, res: List[List[str]], l1: List[str]):
        if(index == len(s)):
            res.append(list(l1))
        
        for i in range(index , len(s)):
            if self.isvalid(s , index , i):
                l1.append(s[index:i+1])
                self.helper(i+1, s,res,l1)
                l1.pop()

    def isvalid(self, s: str, start: int, end:int)->bool:
        while(start<=end):
            if(s[start]!=s[end]):return False
            start+=1
            end-=1
        return True
    
        
        