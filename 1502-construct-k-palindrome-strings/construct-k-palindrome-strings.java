class Solution {
    public boolean canConstruct(String s, int k) {
        Map<Character, Integer> mp = new HashMap<>();
        int singles = 0;
        for(char c: s.toCharArray())
        {
            mp.put(c, mp.getOrDefault(c,0)+1);
        }
        for(int val : mp.values())
        {
            if(val%2==1)
            {
                singles++;
            }
        }
        if(singles<=k && k<=s.length())
        {
            return true;
        }
        return false;
    }
}