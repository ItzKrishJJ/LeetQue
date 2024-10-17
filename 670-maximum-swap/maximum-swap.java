class Solution {
    public int maximumSwap(int num) {
        int maxindex = -1;
        int swap1 = -1, swap2 = -1;
        char nums[] = Integer.toString(num).toCharArray();
        int n = nums.length;
        
        for(int i = n-1; i>=0;i--)
        {
            if(maxindex == -1 || nums[i] > nums[maxindex])
            {
                maxindex = i;
            }
            else if(nums[i]<nums[maxindex]){
                swap1 = i;
                swap2 = maxindex;
            }   
        }

        if(swap1!=-1 && swap2!=-1)
        {
            char temp  = nums[swap1];
            nums[swap1]= nums[swap2];
            nums[swap2] = temp;
        }
        return Integer.parseInt(new String(nums));
    }
}