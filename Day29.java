//Leetcode 73 : Set Matrix Zeroes
class Solution {
    public void setZeroes(int[][] matrix) {

        /*
        Approach 1 : SC = O(mn), TC = O(n*n*n)
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] arr = new int[m][n];

        for(int i = 0; i < m; i++){
          for(int j = 0; j < n; j++){
              arr[i][j] = matrix[i][j];
          }
        }

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(matrix[i][j] == 0){
                    for(int k = 0 ; k < m ; k++){
                        arr[k][j] = 0;
                    }
                    for(int k = 0 ; k < n ; k++){
                        arr[i][k] = 0;
                    }  

                }
            }
        }
       
       for(int i = 0; i < m; i++){
          for(int j = 0; j < n; j++){
              matrix[i][j] = arr[i][j];
          }
        }
     */   

    /*
     Approach 2 : SC = O(m+n) , TC = O(n*n)
     int m = matrix.length;
     int n = matrix[0].length;

     boolean[] row = new boolean[m];
     boolean[] col = new boolean[n];


     for(int i = 0 ; i<m ; i++){
        for(int j = 0 ; j<n ; j++){
            if(matrix[i][j] == 0){
                row[i] = true;
                col[j] = true;
            }
        }
     }

     for(int i = 0 ; i<m ; i++){
        for(int j = 0 ; j<n ; j++){
            if(row[i] == true || col[j] == true){
                matrix[i][j] = 0;
            }
        }
     }
     */

    }
}
