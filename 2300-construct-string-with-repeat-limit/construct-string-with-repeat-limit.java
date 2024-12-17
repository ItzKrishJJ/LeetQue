import java.util.*;

class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        // Step 1: Frequency array to store the count of each character
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Step 2: Priority Queue to store characters in descending order of their ASCII value
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                maxHeap.offer((char) (i + 'a')); // Add character to the maxHeap
            }
        }

        // Step 3: Build the result string with repeat limit
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char current = maxHeap.poll();
            int useCount = Math.min(freq[current - 'a'], repeatLimit); // How many times to use the current character
            
            // Append the current character 'useCount' times
            for (int i = 0; i < useCount; i++) {
                result.append(current);
            }

            freq[current - 'a'] -= useCount; // Update the frequency of the current character

            // If some frequency is left for the current character
            if (freq[current - 'a'] > 0) {
                if (maxHeap.isEmpty()) break; // If no other character is available, break
                
                char next = maxHeap.poll(); // Get the next largest character
                result.append(next); // Use the next character once

                freq[next - 'a']--; // Update frequency of the next character
                maxHeap.offer(current); // Reinsert the current character back into the heap
                if (freq[next - 'a'] > 0) maxHeap.offer(next); // Reinsert next character if some frequency is left
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.repeatLimitedString("cczazz", 2)); // Example input and output
        System.out.println(sol.repeatLimitedString("aababab", 2)); // Another input
    }
}
