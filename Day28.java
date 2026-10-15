//Leetcode 54. Spiral Matrix
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    // ArrayList<Integer> list = new ArrayList<>();    
    // int minR = 0 ;
    // int maxR = matrix.length-1;
    // int minC = 0 ;
    // int maxC = matrix[0].length-1;
    // int count = 0;
    // int te = matrix.length * matrix[0].length;

    // while(minR<=maxR && minC<=maxC){
    //   for(int i = minC ; i<=maxC && count<te; i++){
    //   list.add(matrix[minR][i]);
    //   count++;
    // }
    // minR++;
    // for(int i = minR ; i<=maxR  && count<te; i++) {
    //   list.add(matrix[i][maxC]);
    //   count++;
    // }
    // maxC--;
    // for(int i = maxC ; i>=minC  && count<te; i--){
    //  list.add(matrix[maxR][i]);
    //   count++;
    // }
    // maxR--;
    // for(int i = maxR ; i>=minR  && count<te ; i--){
    //   list.add(matrix[i][minC]);
    //   count++;
    // }
    // minC++;
    // }
    // return list;

     ArrayList<Integer> arr = new ArrayList<>();
     int m = matrix.length;
     int n = matrix[0].length;
     int dir = 0;
     int top = 0;
     int bottom = m-1;
     int left = 0;
     int right = n-1;
     
     while(top<=bottom && left<=right){
        if(dir == 0){
            for(int i = left ; i<= right ; i++){
                arr.add(matrix[top][i]);
            }
            top++;
        }

         if(dir == 1){
            for(int i = top ; i<= bottom ; i++){
                arr.add(matrix[i][right]);
            }
            right--;
        }

        if(dir == 2){
            for(int i = right ; i>= left ; i--){
                arr.add(matrix[bottom][i]);
            }
            bottom--;
        }

        if(dir == 3){
            for(int i = bottom ; i>= top ; i--){
                arr.add(matrix[i][left]);
            }
            left++;
        }
        dir+=1;
        if(dir == 4){
            dir = 0;
        }
     }
     return arr;
    }
}