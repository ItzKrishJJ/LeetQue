class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        findCombinations(1, k, n, list, new ArrayList<>());
        return list;
    }

    private void findCombinations(int num, int k, int n, List<List<Integer>> list, List<Integer> ds) {
        if (ds.size() == k) {
            if (n == 0) {
                list.add(new ArrayList<>(ds));
            }
            return;
        }

        if (num > 9 || n < 0) {
            return;
        }

        ds.add(num);
        findCombinations(num + 1, k, n - num, list, ds);
        ds.remove(ds.size() - 1);

        findCombinations(num + 1, k, n, list, ds);
    }
}
