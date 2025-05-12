class Solution {
    public boolean canAliceWin(int[] nums) {
        int onesSum = 0, twosSum = 0;
        for(int num : nums)
        {
            if(num/10!=0){
                twosSum += num;
            }
            else{
                onesSum += num;
            }
        }
        return twosSum!=onesSum ? true: false;
    }
}