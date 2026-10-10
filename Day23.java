//leetcode 209. Minimum Size Subarray Sum
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0 ;
        int j = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        while(j<n && i<=j){
            sum+=nums[j];

            while(sum>=target){
                int size = j-i+1;
                min = Math.min(min,size);
                sum-=nums[i];
                i++;
            }
            j++;
            
        }
        
        return min==Integer.MAX_VALUE?0:min;
    }
}