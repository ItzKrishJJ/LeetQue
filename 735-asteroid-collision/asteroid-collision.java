
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int num : asteroids) {
            while (!st.isEmpty() && st.peek() > 0 && num < 0) {
                int top = st.pop();
                if (Math.abs(top) > Math.abs(num)) {
                    num = top;
                } else if (Math.abs(top) == Math.abs(num)) {
                    num = 0;
                }
            }
            if (num != 0) {
                st.push(num);
            }
        }
        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}
