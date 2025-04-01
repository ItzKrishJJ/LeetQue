class Solution {
    public String minWindow(String s, String t) {
        int[] hash = new int[256];
        int l = 0, r = 0, cnt = 0, minLen = Integer.MAX_VALUE, sIndex = -1;
        
        for (int i = 0; i < t.length(); i++) {
            hash[t.charAt(i)]++;
        }
        
        while (r < s.length()) {
            if (hash[s.charAt(r)] > 0) cnt++;
            hash[s.charAt(r)]--;
            
            while (cnt == t.length()) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    sIndex = l;
                }
                
                hash[s.charAt(l)]++;
                if (hash[s.charAt(l)] > 0) cnt--;
                l++;
            }
            
            r++;
        }
        
        return sIndex == -1 ? "" : s.substring(sIndex, sIndex + minLen);
    }
}
