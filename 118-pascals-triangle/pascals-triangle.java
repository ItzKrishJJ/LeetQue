class Solution {
    public static List<Integer> generaterows(int row)
    {
        long ans = 1;
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        for(int i=1;i<row;i++)
        {
         ans = ans * (row-i);
            ans = ans / i;
            l1.add((int)ans);
        }
        return l1;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1;i<=numRows;i++)
        {
            list.add(generaterows(i));
            
        }
        return list;
    }
}