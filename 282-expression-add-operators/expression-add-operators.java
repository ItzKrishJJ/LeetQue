class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<>();
        if (num == null || num.length() == 0) return result;
        backtrack(result, "", num, target, 0, 0, 0);
        return result;
    }

    private void backtrack(List<String> result, String expression, String num, int target, int index, long currValue, long lastOperand) {
        if (index == num.length()) {
            if (currValue == target) {
                result.add(expression);
            }
            return;
        }

        for (int i = index; i < num.length(); i++) {
            // Skip numbers with leading zeros
            if (i != index && num.charAt(index) == '0') break;

            String currentStr = num.substring(index, i + 1);
            long currentNum = Long.parseLong(currentStr);

            if (index == 0) {
                // First number, initialize the expression
                backtrack(result, currentStr, num, target, i + 1, currentNum, currentNum);
            } else {
                // Add '+' operator
                backtrack(result, expression + "+" + currentStr, num, target, i + 1, currValue + currentNum, currentNum);

                // Add '-' operator
                backtrack(result, expression + "-" + currentStr, num, target, i + 1, currValue - currentNum, -currentNum);

                // Add '*' operator
                backtrack(result, expression + "*" + currentStr, num, target, i + 1, currValue - lastOperand + (lastOperand * currentNum), lastOperand * currentNum);
            }
        }
    }
}
