class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int i =0;
        int n = s.length();
        while(i<n){
            char c = s.charAt(i);
            int count = 0;
            while(i<n && s.charAt(i)==c){
                count++;
                i++;
            }
            if(count>=2)
            {
                sb.append(c);
                sb.append(c);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}