class Solution {
    public int possibleStringCount(String word) {
        int lastChar = word.charAt(0);
        int res = 0;
        for(int i=1;i<word.length();i++)
        {
            char curr = word.charAt(i);
            if(curr == lastChar)
            {
                res++;   
            }
            lastChar = curr;
        }
        return res+1;
    }
}