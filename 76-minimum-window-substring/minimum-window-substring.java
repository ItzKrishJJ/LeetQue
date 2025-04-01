import java.util.*;

class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";
        Map<Character, Integer> tChars = new HashMap<>();
        for (char c : t.toCharArray()) {
            tChars.put(c, tChars.getOrDefault(c, 0) + 1);
        }
        
        int r = 0, l = 0, minLen = Integer.MAX_VALUE, minStart = 0, matched = 0;
        Map<Character, Integer> sChars = new HashMap<>();
        
        while (r < s.length()) {
            char ch = s.charAt(r);
            if (tChars.containsKey(ch)) {
                sChars.put(ch, sChars.getOrDefault(ch, 0) + 1);
                if (sChars.get(ch).equals(tChars.get(ch))) {
                    matched++;
                }
            }
            
            while (matched == tChars.size()) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    minStart = l;
                }
                
                char leftChar = s.charAt(l);
                if (tChars.containsKey(leftChar)) {
                    sChars.put(leftChar, sChars.get(leftChar) - 1);
                    if (sChars.get(leftChar) < tChars.get(leftChar)) {
                        matched--;
                    }
                }
                l++;
            }
            r++;
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
