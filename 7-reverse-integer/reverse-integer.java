class Solution {
    public int reverse(int no) {
        int rev = 0;
        while(no!=0)
        {
            int digit = no%10;
            if(rev<Integer.MIN_VALUE/10 || rev>Integer.MAX_VALUE/10)
            {
                return 0;
            }
            rev = (rev*10)+digit;
            no = no/10;
        }
        return rev;
    }
}