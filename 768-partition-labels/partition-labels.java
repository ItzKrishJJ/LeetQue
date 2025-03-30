class Solution {
    public List<Integer> partitionLabels(String s) {
        int LastAppeared[] = new int[26];
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<s.length();i++)
        {
            char currChar = s.charAt(i);
            LastAppeared[currChar - 'a'] = i;
        }
        int start = 0 ,end=0;
        for(int i=0;i<s.length();i++)
        {
            end = Math.max(end, LastAppeared[s.charAt(i)-'a']);
            if(i==end)
            {
                ans.add(i -start+1);
                start = i+1;
            }
        }
        return ans;
    }
}