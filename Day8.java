import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        int n = strs.length;

        List<List<String>> result = new ArrayList<>();

        HashMap<String, List<String>> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {

            String temp = strs[i];

            char[] chars = temp.toCharArray();
            Arrays.sort(chars);

            temp = new String(chars);

            mp.putIfAbsent(temp, new ArrayList<>());

            mp.get(temp).add(strs[i]);
        }

        for (List<String> list : mp.values()) {
            result.add(list);
        }

        return result;
    }
}