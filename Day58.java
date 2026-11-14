/*
Leetcode Problem 215: Kth Largest Element in an Array
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        
        return nums[n-k];
    }
}

*/
