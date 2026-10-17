//Leetcode 20 : Valid Parentheses
import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> sc = new Stack<>();

        for(int i = 0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                sc.push(c);
            }
            if(c == ')'){
                if(  sc.isEmpty()   ||  sc.peek() != '('){
                   return false;
                }else{
                    sc.pop();
                }
            }
            if(c == ']'){
                if( sc.isEmpty()  ||   sc.peek() != '['){
                   return false;
                }else{
                    sc.pop();
                }
            }
            if(c == '}'){
                if( sc.isEmpty()  || sc.peek() != '{'){
                   return  false;
                }else{
                    sc.pop();
                }
            }
        }

        return sc.isEmpty();
    }
}