class Solution {
    public int minDeletionSize(String[] strs) {
        int res = 0;
        for(int i=0;i<strs[0].length();i++)
        {
            res+= isUnsorted(strs, i);
        }
        return res;
    }

    public int isUnsorted(String strs[], int j)
    {
        for(int i=1;i<strs.length;i++)
        {
            if(strs[i].charAt(j) < strs[i-1].charAt(j))
                return 1;
        }
        return 0;
    }
}