class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        Set<Integer> combinations = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++)
                {
                    if(i==j || j==k|| i==k)
                    {
                        continue;
                    }
                    int num = digits[i] *100+ digits[j]*10+digits[k];
                    if(num >=100 && num%2==0)
                    {
                        combinations.add(num);
                    }
                }
            }
        }
         List<Integer> res = new ArrayList<>(combinations);
        Collections.sort(res);
        int result[] = new int[res.size()];
        for(int i=0;i<result.length;i++)
        {
            result[i] = res.get(i);
        }
        return result;
    }
}