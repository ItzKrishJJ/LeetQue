
class Solution {
    public int[] previousSmallerElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int res[] = new int[n];

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return res;
    }

    public int[] nextSmallerElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int res[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            res[i] = st.isEmpty() ? n : st.peek(); // Use `n` instead of `-1` for easy width calculation
            st.push(i);
        }
        return res;
    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int nse[] = nextSmallerElement(heights);
        int pse[] = previousSmallerElement(heights);
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1; 
            maxArea = Math.max(maxArea, heights[i] * width);
        }
        return maxArea;
    }
}
