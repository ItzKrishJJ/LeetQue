class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> ans = new ArrayList<>();
        ans.add(folder[0]);

        for(int i=1;i<folder.length;i++)
        {
            String LastFolder = ans.get(ans.size()-1)+'/';

            if(!folder[i].startsWith(LastFolder))
            {
                ans.add(folder[i]);
            }
        }
        return ans;
    }
}