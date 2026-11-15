/*
Leetcode Problem 347: Top K Frequent Elements

// CSWM

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;


        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int element = entry.getKey();
            int freq = entry.getValue();

            bucket[freq].add(element);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = n; i >= 0; i--) {

            if (bucket[i].isEmpty()) {
                continue;
            }

            while (!bucket[i].isEmpty() && k > 0) {

                result.add(bucket[i].get(bucket[i].size() - 1));

                bucket[i].remove(bucket[i].size() - 1);

                k--;
            }
        }

        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}


*/