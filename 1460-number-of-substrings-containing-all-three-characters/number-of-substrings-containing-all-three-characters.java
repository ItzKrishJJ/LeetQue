import java.util.*;

class Solution {
    public int numberOfSubstrings(String s) {
        int res = 0;
        Map<Character, Integer> mp = new HashMap<>();
        int j = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);

            while (mp.getOrDefault('a', 0) >= 1 && 
                   mp.getOrDefault('b', 0) >= 1 && 
                   mp.getOrDefault('c', 0) >= 1) {
                res += s.length() - i;
                mp.put(s.charAt(j), mp.get(s.charAt(j)) - 1); // Corrected decrement
                j++;
            }
        }
        return res;
    }
}
