//Leetcode 3: Longest Substring Without Repeating Characters
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        Map<Character, Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;
        int max = 0;

        while (j < n) {
            char ch = s.charAt(j);

            if (map.containsKey(ch)) {
                i = Math.max(i, map.get(ch) + 1);
            }

            map.put(ch, j);

            max = Math.max(max, j - i + 1);

            j++;
        }

        return max;
    }
}