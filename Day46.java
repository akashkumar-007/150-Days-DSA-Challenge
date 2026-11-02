/*
Leetcode Problem 34: Find First and Last Position of Element in Sorted Array
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};

        int n = nums.length;
        if(n == 0) return result;

        int leftmost = -1;
        int rightmost = -1;

        int start =0;
        int end = n-1;

        while(start<=end){
            int mid = (start + end)/2;

            if(nums[mid] == target){
                 leftmost = mid; 
                 end = mid-1;
            }else if(nums[mid] > target){
              end = mid-1;
            }else{
                start = mid+1;
            }
        }

         start =0;
         end = n-1;
        while(start<=end){
            int mid = (start + end)/2;

            if(nums[mid] == target){
                 rightmost = mid; 
                 start = mid+1;
            }else if(nums[mid] > target){
              end = mid-1;
            }else{
                start = mid+1;
            }
        }


        result[0] = leftmost;
        result[1] = rightmost;

        return result;
    }
}
*/