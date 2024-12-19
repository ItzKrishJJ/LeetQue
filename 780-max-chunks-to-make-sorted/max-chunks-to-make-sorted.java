class Solution {
    public int maxChunksToSorted(int[] arr) {
        int s[] = arr.clone();
        Arrays.sort(s);
        int cnt = 0;
        int ind = -1;
        for(int i=0;i<arr.length;i++)
        {
            ind = Math.max(ind, findIndex(s,arr[i]));
            if(ind==i)
            {
                cnt++;
            }
        }
        return cnt;
    }
    private int findIndex(int[] s, int target)
    {
        for(int i=0;i<s.length;i++)
        {
            if(s[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}