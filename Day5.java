// leetcode 41. First Missing Positive
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean onePresent = false;
        for(int i = 0 ; i<n ; i++){
            if(nums[i] == 1){
                onePresent = true;
            }
            if(nums[i] <= 0 || nums[i]>n){
                nums[i] = 1;
            }
        }

        if(!onePresent){
            return 1;
        }

        for(int i = 0 ; i<n ; i++){
            int num = Math.abs(nums[i]);

            int idx = num-1;

            if(nums[idx]<0){
                continue;
            }else{
                nums[idx]*=-1;
            }
        }
        for(int i = 0 ; i<n ; i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}