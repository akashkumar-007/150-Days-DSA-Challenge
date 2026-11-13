/*
Leetcode Problem 57: non-overlapping Intervals

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        List<int[]> arr = new ArrayList<>();

        for(int i = 0 ; i<n ; i++){
            arr.add(intervals[i]);
        }

        int count = 0;

        int i = 1;

        while(i<arr.size()){
            int[] prev = arr.get(i-1);
            int[] next = arr.get(i);
            if(prev[1]>next[0]){
                count++;
                arr.remove(i);
            }else{
                i++;
            }
        }
        return count;
    }
}
    
*/