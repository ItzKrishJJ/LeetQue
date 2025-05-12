class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        int flag = 1;
        String s= Integer.toString(n);
        for(int i=0;i<s.length();i++)
        {
            int digit = s.charAt(i) - '0';
            if(flag==1)
            {
                sum +=digit;
            }
            else{
                sum -= digit;
            }
            flag = flag==1?0:1;
        }
        return sum;
    }
}