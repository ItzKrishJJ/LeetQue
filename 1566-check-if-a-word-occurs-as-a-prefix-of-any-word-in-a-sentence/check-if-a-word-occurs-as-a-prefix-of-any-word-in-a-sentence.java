class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] array = sentence.split("\\s+");
        for(int i=0;i<array.length;i++)
        {
            String text = array[i];
           if(text.startsWith(searchWord))
           {
            return i+1;
           }
        }
        return -1;
    }
}