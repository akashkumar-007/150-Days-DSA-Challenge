/*
Leetcode Problem 74: Search a 2D Matrix
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0;
        int j = m - 1;

        while (i <= j) {

            int mid = (i + j) / 2;

            if (matrix[mid][0] == target) {
                return true;
            }
            else if (matrix[mid][0] > target) {
                j = mid - 1;
            }
            else if (matrix[mid][n - 1] < target) {
                i = mid + 1;
            }
            else {

                int p = 0;
                int q = n - 1;

                while (p <= q) {

                    int mid2 = (p + q) / 2;

                    if (matrix[mid][mid2] == target) {
                        return true;
                    }
                    else if (matrix[mid][mid2] < target) {
                        p = mid2 + 1;
                    }
                    else {
                        q = mid2 - 1;
                    }
                }

                return false;
            }
        }

        return false;
    }
}

*/