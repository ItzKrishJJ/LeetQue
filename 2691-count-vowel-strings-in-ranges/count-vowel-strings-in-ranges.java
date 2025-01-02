import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] isVowelString = new int[words.length];
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        // Step 1: Determine if each word is a vowel string
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 0 && vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length() - 1))) {
                isVowelString[i] = 1;
            }
        }

        // Step 2: Build prefix sum
        int[] prefixSum = new int[words.length];
        prefixSum[0] = isVowelString[0];
        for (int i = 1; i < words.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + isVowelString[i];
        }

        // Step 3: Answer queries using prefix sum
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            result[i] = prefixSum[end] - (start > 0 ? prefixSum[start - 1] : 0);
        }

        return result;
    }
}
