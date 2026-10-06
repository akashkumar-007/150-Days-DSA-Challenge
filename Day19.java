//leetcode 125. Valid Palindrome
class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;

        while(i<=j){
            
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }

            char ch1 = Character.toLowerCase(s.charAt(i));
            char ch2 = Character.toLowerCase(s.charAt(j));

            if(ch1 != ch2){
                return false;
            }

            i++;
            j--;

        }

        return true;
    }
}