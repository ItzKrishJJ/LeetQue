class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, right = 0, maxCount = 0, maxLen = 0;
        int[] freq = new int[26];

        while (right < s.length()) {
            freq[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, freq[s.charAt(right) - 'A']);

            // If the window size minus the max frequency character count is greater than k, shrink the window
            while ((right - left + 1) - maxCount > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}
