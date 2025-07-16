class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        int start = 0,end = n-1;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        StringBuilder sb = new StringBuilder(s);
        while(start<=end)
        {
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);
            if(!vowels.contains(startChar))
            {
                start++;
            }   
            else if(!vowels.contains(endChar))
            {
                end--;
            }
            else{
                      
                sb.setCharAt(start, endChar);
                sb.setCharAt(end, startChar);
                start++;
                end--;
            }   
        }
        return sb.toString();
    }
}