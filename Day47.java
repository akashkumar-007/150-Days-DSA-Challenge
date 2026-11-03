/*

class Solution {
    private static int findPivot(int[] arr){
        int l = 0;
        int r = arr.length-1;

        while(l<r){
            int mid = (l+r)/2;
            if(arr[mid]>arr[r]){
                l = mid +1;
            }else{
                r = mid;
            }
        }

        return l;
    }
    private static int findIndx(int[] arr,int target,int str , int end){
        while(str<=end){
            int mid = (str+end)/2;
            if(arr[mid] == target){
              return mid;
            }else if(arr[mid] > target){
                end = mid-1;
            }else{
                str = mid+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int pv = findPivot(nums);
        int rs = findIndx(nums,target,0,pv);
        if(rs != -1){
            return rs;
        }
        int rs2 = findIndx(nums,target,pv,nums.length-1);
        if(rs2 != -1){
            return rs2;
        }
        return -1;
    }
}

*/