import java.util.*;

class Solution {
    public String robotWithString(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char minChar = 'a';

        for (char c : s.toCharArray()) {
            stack.push(c);
            freq[c - 'a']--;

            // Find next smallest available character
            while (minChar <= 'z' && freq[minChar - 'a'] == 0) {
                minChar++;
            }

            // Pop while top of stack <= smallest remaining
            while (!stack.isEmpty() && stack.peek() <= minChar) {
                result.append(stack.pop());
            }
        }

        // Pop all remaining in the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
