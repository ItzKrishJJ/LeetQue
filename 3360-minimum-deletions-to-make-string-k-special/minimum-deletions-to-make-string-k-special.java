class Solution {
    public int minimumDeletions(String word, int k) {
        Map<Character, Integer> cnt = new HashMap<>();
        int res =word.length();
        for(char c: word.toCharArray())
        {
            cnt.put(c, cnt.getOrDefault(c, 0)+1);
        }

        for(int a : cnt.values())
        {
            int deleted = 0;
            for(int b : cnt.values())
            {
                if(b<a)
                {
                    deleted+=b;
                }
                if(b>a+k)
                {
                    deleted += b-(a+k);
                }
            }
            res = Math.min(res, deleted);
        }
        return res;
    }
}