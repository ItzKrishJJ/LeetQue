class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int pairs = nums.length/3;
        Arrays.sort(nums);
        // boolean taken[] = new boolean[nums.length];

        int[][] parts = new int[pairs][3];
        int j = 0;
        for(int i=0;i<nums.length;i+=3)
        {
            if(nums[i+2] - nums[i] > k)
            {
                return new int[0][0];
            }
            else{
                parts[j][0] = nums[i];
                parts[j][1] = nums[i+1];
                parts[j][2] = nums[i+2];
            }
            j++;
        }

        return parts;

    }
}