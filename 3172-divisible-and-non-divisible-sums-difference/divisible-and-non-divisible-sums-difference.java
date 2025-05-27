class Solution {
    public int differenceOfSums(int n, int m) {
        int totalsum = (n*(n+1)/2);
        int divisible = 0;
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                divisible+=i;
            }
        }
        return totalsum - (2*divisible);
    }
}