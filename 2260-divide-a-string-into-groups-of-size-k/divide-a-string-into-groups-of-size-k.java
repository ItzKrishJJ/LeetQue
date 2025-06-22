class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        // int parts = n/k;
        int parts = (n + k - 1) / k;
        
        String[] res = new String[parts];
        int j=0;
        for(int i=0;i<res.length;i++)
        {
            StringBuilder sb= new StringBuilder();
            int count = 1;
            while(j<n && count<=k)
            {
                sb.append(s.charAt(j));
                j++;
                count++;
            }
            while (sb.length() < k) {
                sb.append(fill);
            }
            res[i] = sb.toString();
        }
        
        return res;
    }
}