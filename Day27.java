//leetcode 239. Sliding Window Maximum
import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;
        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[n - k + 1];

        int index = 0;

        for (int i = 0; i < n; i++) {

            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

          
            while (!deque.isEmpty() && nums[i] > nums[deque.peekLast()]) {
                deque.pollLast();
            }

           
            deque.offerLast(i);

            
            if (i >= k - 1) {
                result[index++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}