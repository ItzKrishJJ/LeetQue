class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                list.add(grid[i][j]);
            }
        }
        Collections.sort(list);
        int result = 0;
        int finalCommonNumber = list.get(list.size()/2);
        for(int num : list)
        {
            if(num%x != finalCommonNumber%x)
            {
                return -1;
            }
            result += Math.abs(finalCommonNumber - num)/x;
        }

        return result;
    }
}