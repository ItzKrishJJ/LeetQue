class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int start = 0;
        int end = 0;
        int sum = 0;
        int maxSum = 0;

        while (end < nums.length) {
            if (!mp.containsKey(nums[end])) {
                mp.put(nums[end], end);
                sum += nums[end];
                maxSum = Math.max(maxSum, sum); //update max sum here
                end++;
            } else {
                int idx = mp.get(nums[end]);
                while (start <= idx) {
                    sum -= nums[start];
                    mp.remove(nums[start]); // remove outdated value
                    start++;
                }
                // Now re-add the current element
                mp.put(nums[end], end);
                sum += nums[end];
                maxSum = Math.max(maxSum, sum); // update max sum again
                end++;
            }
        }

        return maxSum;
    }
}
