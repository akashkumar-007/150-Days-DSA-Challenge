// leetcode 31. Next Permutation
class Solution {

    public void nextPermutation(int[] nums) {

        int n = nums.length;

        int golaIndex = -1;

        for (int i = n - 1; i > 0; i--) {

            if (nums[i] > nums[i - 1]) {
                golaIndex = i - 1;
                break;
            }
        }

        if (golaIndex != -1) {

            int swapIndex = golaIndex;

            for (int i = n - 1; i >= golaIndex + 1; i--) {

                if (nums[i] > nums[golaIndex]) {
                    swapIndex = i;
                    break;
                }
            }

        
            int temp = nums[golaIndex];
            nums[golaIndex] = nums[swapIndex];
            nums[swapIndex] = temp;
        }

        reverse(nums, golaIndex + 1, n - 1);
    }


    private void reverse(int[] nums, int i, int j) {

        while (i < j) {

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
}