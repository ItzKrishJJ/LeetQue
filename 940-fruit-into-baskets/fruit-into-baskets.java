import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        int start = 0, max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int end = 0; end < fruits.length; end++) {
            map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);

            // shrink the window if more than 2 types of fruits
            while (map.size() > 2) {
                map.put(fruits[start], map.get(fruits[start]) - 1);
                if (map.get(fruits[start]) == 0) {
                    map.remove(fruits[start]);
                }
                start++;
            }

            max = Math.max(max, end - start + 1);
        }

        return max;
    }
}
