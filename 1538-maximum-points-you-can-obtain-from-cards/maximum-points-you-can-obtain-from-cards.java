class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total_pts = 0;

        // Compute total sum of all elements
        for (int card : cardPoints) {
            total_pts += card;
        }

        // If we take all cards, return the total sum
        if (k == n) {
            return total_pts;
        }

        // Sliding window of size (n - k)
        int windowSize = n - k;
        int windowSum = 0;

        // Compute initial sum of the first (n-k) elements
        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }

        int minWindowSum = windowSum;

        // Move the window and update the minimum sum
        for (int i = windowSize; i < n; i++) {
            windowSum += cardPoints[i] - cardPoints[i - windowSize];
            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        // Max score = total points - min window sum
        return total_pts - minWindowSum;
    }
}
