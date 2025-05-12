class Solution {
    int countSumOfDigit(int no)
    {
        int sum = 0;
        while(no!=0)
        {
            int digit = no%10;
            sum = sum + digit;
            no = no/10;
        }
        return sum;
    }
    public int countEven(int num) {
        int res = 0;
        for(int i =1;i<=num;i++)
        {
            if(countSumOfDigit(i)%2==0)
            {
                res++;
            }
        }
        return res;
    }
}