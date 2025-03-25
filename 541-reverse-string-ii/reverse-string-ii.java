class Solution {
    public void helper(StringBuilder sb, int start, int end)
    {
        while(start<end)
        {
            char ch = sb.charAt(start);
            sb.setCharAt(start , sb.charAt(end));
            sb.setCharAt(end ,ch);
            start++;
            end--;
        }
    }
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while(i<s.length())
        {
            int j = Math.min(i+k-1, s.length()-1);
            helper(sb,i,j);
            i += 2*k;
        }
        return sb.toString();
    }
}