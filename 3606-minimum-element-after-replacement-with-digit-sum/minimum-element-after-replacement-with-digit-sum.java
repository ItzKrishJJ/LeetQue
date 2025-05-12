class Solution {
    private int calculateSumOfDigits(int no)
    {
        int sum = 0;
        while(no!=0)
        {
            int digit = no%10;
            sum+=digit;
            no/=10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            l1.add(calculateSumOfDigits(nums[i]));
        }
        Collections.sort(l1);
        return l1.get(0);
    }
}