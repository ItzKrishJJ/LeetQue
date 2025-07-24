class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        Boolean[][] dp = new Boolean[n + 1][n + 1];
        return isValid(s.toCharArray(), 0, 0, dp);
    }

    public boolean isValid(char[] s, int ind, int count, Boolean[][] dp) {
        if (count < 0) return false;
        if (ind == s.length) return count == 0;
        if (dp[ind][count] != null) return dp[ind][count];

        boolean res = false;
        if (s[ind] == '(') {
            res = isValid(s, ind + 1, count + 1, dp);
        } else if (s[ind] == ')') {
            res = isValid(s, ind + 1, count - 1, dp);
        } else { // s[ind] == '*'
            res = isValid(s, ind + 1, count + 1, dp) || // treat * as (
                  isValid(s, ind + 1, count - 1, dp) || // treat * as )
                  isValid(s, ind + 1, count, dp);       // treat * as ""
        }

        dp[ind][count] = res;
        return res;
    }
}
