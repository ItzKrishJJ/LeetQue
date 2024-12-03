class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            // Check if the current index matches a space position
            if (index < spaces.length && i == spaces[index]) {
                sb.append(" ");
                index++; // Move to the next space index
            }
            sb.append(s.charAt(i)); // Append the current character
        }
        return sb.toString();
    }
}
