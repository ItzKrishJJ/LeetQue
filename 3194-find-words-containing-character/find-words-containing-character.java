import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            if (str.indexOf(x) != -1) { // Using indexOf() to check if the character is present
                l1.add(i);
            }
        }
        return l1;
    }
}
