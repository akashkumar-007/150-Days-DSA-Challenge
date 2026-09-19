
// Leetcode Problem: 169. Majority Element
class Solution {
    public int majorityElement(int[] nums) {
        // First Approach 
        // Time complexity O(n*logn)
        // Space Complexity O(1)

         // Arrays.sort(nums);
        // int n = nums.length;
        // int i = 0;
        // int j = 0;

        // while(j<n){
        //     if(nums[j] != nums[i]){
        //         if((j-i)>(n/2)){
        //             return nums[i];
        //         }else{
        //             i = j;
        //         }
        //     }else{
        //         j++;
        //     }
        // }
        // if((j-i)>(n/2)){
        //     return nums[i];
        //  }

        //  return -1;

        //Second Approach
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i<n ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
          if (entry.getValue() > n / 2) {
            return entry.getKey();
           }
        }
      return -1;
       
    }
}