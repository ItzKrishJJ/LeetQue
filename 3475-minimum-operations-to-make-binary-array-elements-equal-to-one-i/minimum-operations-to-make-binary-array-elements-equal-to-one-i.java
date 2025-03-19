class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int res = 0;
        int left = 0;

        while (left < n) {
            while (left < n && nums[left] == 1) {
                left++;
            }

            if (left >= n) break;
            if (left + 2 >= n) return -1;

            for (int i = left; i < left + 3; i++) {
                nums[i] = nums[i] == 0 ? 1 : 0;
            }

            res++;
            left++;
        }

        return res;
    }
}
