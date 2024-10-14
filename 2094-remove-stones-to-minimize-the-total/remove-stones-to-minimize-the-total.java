import java.util.PriorityQueue;
import java.util.Comparator;

class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> myheap = new PriorityQueue<>(Comparator.reverseOrder());
        
        int totalSum = 0;
        for (int num : piles) {
            myheap.add(num);
            totalSum += num;
        }

        for (int i = 0; i < k; i++) {
            int top = myheap.poll();
            int removedStones = top / 2;
            totalSum -= removedStones;
            myheap.add(top - removedStones);
        }

        return totalSum;
    }
}
