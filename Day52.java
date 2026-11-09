/*
Leetcode 1011. Capacity To Ship Packages Within D Days
class Solution {
    public int findDays(int[] weights, int cap) {
        int days = 1;
        int load = 0;
   for (int i = 0; i < weights.length; i++) {
            if (weights[i] + load > cap) {
                days++;
           load = weights[i];
            } 
            else {
                load += weights[i];
            }
           }
        return days;
    }
    public int shipWithinDays(int[] weights, int d) {
        int low = 0;
        int high = 0;
        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int numberOfDays = findDays(weights, mid);

            if (numberOfDays <= d) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        return low;
    }
}
*/