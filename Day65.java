/*
 // Leetcode 39
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        solve(0, candidates, target, current, result);

        return result;
    }

    public void solve(int idx, int[] arr, int target,
                      List<Integer> current,
                      List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (idx == arr.length || target < 0) {
            return;
        }
        current.add(arr[idx]);
        solve(idx, arr, target - arr[idx], current, result);


        current.remove(current.size() - 1);

        solve(idx + 1, arr, target, current, result);
    }
}


*/