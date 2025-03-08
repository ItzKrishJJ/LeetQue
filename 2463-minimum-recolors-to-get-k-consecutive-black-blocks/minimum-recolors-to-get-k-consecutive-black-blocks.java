class Solution {
    public int minimumRecolors(String blocks, int k) {
        int len = blocks.length();
        int countW = 0;
        int minres = 0;
        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i)=='W') countW++;
        }
        minres = countW;
        for(int i=k;i<len;i++)
        {
            if(blocks.charAt(i-k)=='W') countW--;
            if(blocks.charAt(i)=='W') countW++;
            minres = Math.min(minres, countW);

        }
        return minres;
    }
}