import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {

        int n = s.length();

        if (t.length() > n) {
            return "";
        }

        HashMap<Character, Integer> mp = new HashMap<>();

    
        for (char ch : t.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        int requiredCount = t.length();

        int i = 0;
        int j = 0;

        int minWindowSize = Integer.MAX_VALUE;
        int start_i = 0;

        while (j < n) {

            char ch = s.charAt(j);

            if (mp.getOrDefault(ch, 0) > 0) {
                requiredCount--;
            }

            mp.put(ch, mp.getOrDefault(ch, 0) - 1);

            
            while (requiredCount == 0) {

                int currWindowSize = j - i + 1;

                if (minWindowSize > currWindowSize) {
                    minWindowSize = currWindowSize;
                    start_i = i;
                }

                char leftChar = s.charAt(i);

                mp.put(leftChar, mp.getOrDefault(leftChar, 0) + 1);

                if (mp.get(leftChar) > 0) {
                    requiredCount++;
                }

                i++;
            }

            j++;
        }

        return minWindowSize == Integer.MAX_VALUE
                ? ""
                : s.substring(start_i, start_i + minWindowSize);
    }
}