import java.util.Arrays;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hash[] = new int[256];
        Arrays.fill(hash, -1); // Initialize hash array to -1
        int right = 0, left = 0;
        int maxLen = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);

            if (hash[ch] != -1 && hash[ch] >= left) { // Check if character is repeated inside the current window
                left = hash[ch] + 1;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            hash[ch] = right; // Update the last index of the character
            right++;
        }
        return maxLen;
    }

    
}
