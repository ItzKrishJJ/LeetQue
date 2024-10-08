class Solution {
    public int minSwaps(String s) {
        int count = 0;
        int imbalance = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                imbalance++;
            } else {
                imbalance--;
            }

            if (imbalance < 0) {
                count++;
                imbalance +=2;
            }
        }

        return count;
    }
}
