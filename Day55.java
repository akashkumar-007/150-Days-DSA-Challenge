/*
Leetcode Problem 56: Merge Intervals
class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals, (a, b) ->  Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        result.add(intervals[0]);

        for(int i = 1 ; i<intervals.length ; i++){
            int[] last = result.get(result.size()-1);
            int[] interval = intervals[i];
            if(last[1]>=interval[0]){
               last[0] = Math.min(interval[0],last[0]);
               last[1] = Math.max(interval[1],last[1]);
            }else{
                result.add(interval);
            }

        }
        return result.toArray(new int[result.size()][]);
    }
}

*/