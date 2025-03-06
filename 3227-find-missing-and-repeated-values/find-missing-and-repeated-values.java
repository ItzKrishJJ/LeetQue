class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int res[] = new int[2];
        Map<Integer, Integer> mp = new HashMap<>();
        int n = grid.length;
        
        for (int[] row : grid) {
            for (int num : row) {
                mp.put(num, mp.getOrDefault(num, 0) + 1);
            }
        }

        for (int i = 1; i <= n * n; i++) {
            int count = mp.getOrDefault(i, 0);
            if (count == 2) {
                res[0] = i;
            } else if (count == 0) {
                res[1] = i;
            }
        }
        return res;
    }
}
