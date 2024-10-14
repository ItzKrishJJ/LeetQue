class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int num : nums)
        {
            maxHeap.add(num);
        }
        long ans = 0;
        while(k>0)
        {
            int top = maxHeap.poll();
            ans += top;
            top  = top %3==0 ? top/3 : top/3+1;
            maxHeap.add(top);
            k--;
        }

        return ans;
    }
}