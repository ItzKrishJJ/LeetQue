class Solution {
    public int maxScore(String s) {
        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            }
        }
        int ans = 0;
        int zero = 0;
        for (int i = 0; i < s.length() - 1; i++) { // Stop before the last character
            if (s.charAt(i) == '0') {
                zero++;
            } else {
                ones--;
            }
            ans = Math.max(ans, zero + ones);
        }
        return ans;
    }
}
