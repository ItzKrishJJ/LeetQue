class Solution {
    public int repeatedStringMatch(String a, String b) {
        int res = 0;
        StringBuilder sb = new StringBuilder();;
        while (sb.length() < b.length()) {
            sb.append(a);
            res++;
        }

        if (sb.toString().contains(b)) {
            return res;
        }
        sb.append(a);
        res++;
        if (sb.toString().contains(b)) {
            return res;
        }

        return -1;
    }
}
