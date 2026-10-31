/* 
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zero = 0;
        int one = 0;
        int two = 0;

        for(int i = 0 ; i<n ; i++){
            if(nums[i] == 0){
                zero++;
            }
            if(nums[i] == 1){
                one++;
            }
            if(nums[i] == 2){
                two++;
            }
        }
         int i = 0;
         while(zero-->0){
            nums[i++] = 0;
         }
         while(one-->0){
            nums[i++] = 1;
         }
         while(two-->0){
            nums[i++] = 2;
         }
        
        // Second Approach
        // int i = 0;
        // int j = 0;
        // int k = nums.length-1;

        // while(i<=k){
        //     if(nums[i] == 0){
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //         i++;
        //         j++;
        //     }else if(nums[i] == 2){
        //         int temp = nums[i];
        //         nums[i] = nums[k];
        //         nums[k] = temp;
        //         k--;
        //     }else{
        //         i++;
        //     }
        // }

        
    }
}

*/