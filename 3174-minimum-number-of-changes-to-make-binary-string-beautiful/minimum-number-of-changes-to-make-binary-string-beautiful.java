class Solution {
    public int minChanges(String s) {
        char arr[] = s.toCharArray();
        int ans = 0;
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0 && s.charAt(i)!=s.charAt(i+1))
            {
                ans++;
                i+=1;
            }
            else if(i%2!=0 && s.charAt(i)!=s.charAt(i-1))
            {
                ans++;
                i+=1;
            }
        }
        return ans;
    }
}