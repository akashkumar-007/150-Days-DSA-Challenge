//leetcode 214. shortest palindrome
class Solution {
    public String shortestPalindrome(String s) {
        
        String rev = s;
        
        // Reverse the string
        rev = new StringBuilder(rev).reverse().toString();

        for (int i = 0; i < s.length(); i++) {
            
            if (s.substring(0, s.length() - i)
                    .equals(rev.substring(i))) {
                
                return rev.substring(0, i) + s;
            }
        }

        return rev + s;
    }
}