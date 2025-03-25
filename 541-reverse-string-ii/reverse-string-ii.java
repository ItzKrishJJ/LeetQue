class Solution {
    public void helper(char chars[], int start, int end) {
        while (start < end) { // Swap characters until the segment is fully reversed
            char ch = chars[start];
            chars[start] = chars[end];
            chars[end] = ch;
            start++;
            end--;
        }
    }

    public String reverseStr(String s, int k) {
        char chars[] = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2 * k) {
            int j = Math.min(i + k - 1, s.length() - 1); // Find the correct end index
            helper(chars, i, j);
        }
        return new String(chars);
    }
}
