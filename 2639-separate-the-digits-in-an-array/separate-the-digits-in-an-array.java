class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int num : nums)
        {
            List<Integer> l1= new ArrayList<>();
            if(num==0)
            {
                l1.add(0);
            }
            else{
                    
                while(num!=0)
                {
                    int digit = num%10;
                    l1.add(digit);
                    num = num/10;
                }
                Collections.reverse(l1);
            }
            result.addAll(l1);
        }
        int res[] = new int[result.size()];
        for(int i=0;i<res.length;i++)
        {
            res[i] = result.get(i);
        }
        return res;
    }
}