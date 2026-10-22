/* 
Leetcode Problem 739: Daily Temperatures
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        //Approach 1: Brute Force TC: O(n^2) SC: O(n)
        // int n = temperatures.length;
        // int[] arr = new int[n];

        

        // for(int i = 0 ; i<n ; i++){
        //     for(int j = i+1 ; j<n  ; j++){
        //         if(temperatures[j]>temperatures[i]){
        //             arr[i] = j-i;
        //             break;
        //         }
        //     }
        // }
        // return arr;

        //Approach 2: Using Stack TC: O(n) SC: O(n)
        int[] arr = new int[temperatures.length];
        Stack<Integer> sc = new Stack<>();
        sc.push(0);

        for(int i = 1 ; i<temperatures.length ; i++){
            int ct = temperatures[i];
            while(!sc.isEmpty() ){
                int idx = sc.peek();
                int v = temperatures[idx];

                if(v<ct){
                    arr[idx] = i - idx;
                    sc.pop();
                }else{
                    break;
                }
            }
            sc.push(i);
        }
        return arr;
    }
}
*/