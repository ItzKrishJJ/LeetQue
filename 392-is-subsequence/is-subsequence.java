class Solution {
    public boolean isSubsequence(String s, String t) {
    
        if(s.length()==0) return true;
        char lastChar = s.charAt(0);
        int j=0;
        for(int i=0;i<t.length();i++)
        {
            char c = t.charAt(i);
            if(c == s.charAt(j))
            {
                j++;
                if(j==s.length()) return true;
                
            }
        }
        if(j<s.length()) return false;
        return true;
       
    }
}