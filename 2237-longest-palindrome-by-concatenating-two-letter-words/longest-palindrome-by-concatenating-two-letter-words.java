class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> mp = new HashMap<>();
        for (String s : words) {
            mp.put(s, mp.getOrDefault(s, 0) + 1);
        }

        int length = 0;
        boolean central = false;

        for (String s : mp.keySet()) {
            int count = mp.get(s);
            if (s.charAt(0) == s.charAt(1)) {
                // Handle palindromic words like "gg"
                length += (count / 2) * 4;
                if (count % 2 == 1) {
                    central = true;
                }
            } else {
                String rev = "" + s.charAt(1) + s.charAt(0);
                if (mp.containsKey(rev)) {
                    int pairs = Math.min(count, mp.get(rev));
                    length += pairs * 4;
                    mp.put(rev, mp.get(rev) - pairs); // decrease reverse count
                    mp.put(s, mp.get(s) - pairs);     // decrease current count
                }
            }
        }

        if (central) {
            length += 2;
        }

        return length;
    }
}
