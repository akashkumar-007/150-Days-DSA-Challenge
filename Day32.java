//Leetcode 150. Evaluate Reverse Polish Notation
// Time Complexity : O(n) where n is the number of tokens
// Space Complexity : O(n) where n is the number of tokens
/* 
class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            if (tokens[i].equals("+") ||
                tokens[i].equals("-") ||
                tokens[i].equals("*") ||
                tokens[i].equals("/")) {

                int a = st.pop();
                int b = st.pop();

                int c = 0;

                if (tokens[i].equals("+")) {
                    c = b + a;
                } 
                else if (tokens[i].equals("-")) {
                    c = b - a;
                } 
                else if (tokens[i].equals("*")) {
                    c = b * a;
                } 
                else if (tokens[i].equals("/")) {
                    c = b / a;
                }

                st.push(c);

            } else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }

        return st.peek();
    }
}
*/