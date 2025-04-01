import java.util.*;

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return count(nums, k) - count(nums, k - 1);
    }

    public int count(int[] nums, int k) {
        int r = 0, l = 0, cnt = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        while (r < nums.length) {
            mp.put(nums[r], mp.getOrDefault(nums[r], 0) + 1);
            while (mp.size() > k) {
                mp.put(nums[l], mp.get(nums[l]) - 1);
                if (mp.get(nums[l]) == 0) mp.remove(nums[l]);
                l++;
            }
            cnt += r - l + 1;
            r++;
        }
        return cnt;
    }
}