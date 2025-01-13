class Solution {
    public int minimumLength(String s) {
        if(s.length()<3)
        {
            return s.length();
        }
        Map<Character, Integer> mp = new HashMap<>();
        for(char c: s.toCharArray())
        {
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        int totallength = 0;
        for(int key: mp.values())
        {
            if(key%2==0)
            {
                totallength+=2;
            }
            else{
                totallength+=1;
            }
        }
        return totallength;
    }
}