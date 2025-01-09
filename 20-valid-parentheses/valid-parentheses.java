import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        char arr[] = s.toCharArray();
        Stack<Character> st = new Stack<>();
        
        for (char c : arr) {
            // If it's an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } 
            // If it's a closing bracket
            else {
                // If the stack is empty or the top of the stack doesn't match the closing bracket, return false
                if (st.isEmpty()) {
                    return false;
                }
                
                // Pop the top element of the stack
                char ch = st.pop();
                
                // Check if the closing bracket matches the top of the stack
                if ((c == ')' && ch != '(') || 
                    (c == '}' && ch != '{') || 
                    (c == ']' && ch != '[')) {
                    return false;
                }
            }
        }
        
        // If the stack is empty, all brackets were matched correctly
        return st.isEmpty();
    }
}
