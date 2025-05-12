class Solution {
    public int minimumSum(int num) {
        List<Integer> l1 = new ArrayList<>();
        while(num!=0)
        {
            int digit = num%10;
            l1.add(digit);
            num/=10;
        }
        Collections.sort(l1);
        int digit1 = l1.get(0)*10 + l1.get(2);
        int digit2 = l1.get(1)*10 + l1.get(3);
        return digit1+digit2;
    }
}