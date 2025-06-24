class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i =0;i<candies.length;i++){
            if(candies[i]>max)
            {
                max = candies[i];
            }
        }
         List<Boolean> res = new ArrayList<>();
         for(int i=0;i<candies.length;i++)
         {
            int maxcandy = candies[i] + extraCandies;
            if(maxcandy >= max)
            {
                res.add(true);
            }
            else
            {
                res.add(false);
            }
         }
         return res;
    }
}