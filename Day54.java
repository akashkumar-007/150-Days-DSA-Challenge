/*
Leetcode Problem 4: Median of Two Sorted Arrays

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int q = m + n;
        int[] nums3 = new int[q];

      
        System.arraycopy(nums1, 0, nums3, 0, m);
          System.arraycopy(nums2, 0, nums3, m, n);

        Arrays.sort(nums3);

        if (q % 2 != 0) {
          
            return nums3[q / 2];
        } else {
            return (nums3[q / 2 - 1] + nums3[q / 2]) / 2.0;
        }
    }
}
*/