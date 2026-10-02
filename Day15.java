//leetcode 128. Longest Consecutive Sequence
import java.util.Arrays;
class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 1;
        int max = 0;
        if(n == 1){
            return 1;
        }else if(n == 0){
            return 0;
        }
        for(int i = 1 ; i<n ; i++){
            int p = nums[i] - nums[i-1];
            if(p == 0){
                continue;
            }else if(p == 1){
                count++;
            }else{
                max = Math.max(max,count);
                count =1;
            }
        }
        max = Math.max(count,max);
        return max;
    }
}