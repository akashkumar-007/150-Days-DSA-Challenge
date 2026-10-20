/* 
leetcode 224. Basic Calculator
class Solution {
    public int calculate(String s) {
        Stack<Integer> sc = new Stack<>();
        int num = 0;
        int result = 0 ;
        int sign = 1;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = (num*10)+(ch - '0');
            }else if(ch == '+'){
                result = result + (num*sign);
                num = 0;
                sign = 1;
            }else if(ch == '-'){
                result = result + (num*sign);
                num = 0;
                sign = -1;
            }else if(ch == '('){
                sc.push(result);
                sc.push(sign);

                num = 0;
                result = 0;
                sign = 1;


            }else if(ch == ')'){
                result = result + (num*sign);
                num = 0;
                sign = 1;

                int lastSign = sc.pop();
                int lastResult = sc.pop();

                result = lastResult + (lastSign*result); 
            }
        }
        result = result + (sign * num);
        return result;
    }
}
*/