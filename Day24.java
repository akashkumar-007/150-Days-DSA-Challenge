//leetcode 567. Permutation in String
//Approach 1
import java.util.Arrays;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s2.length();
        char arr[] =  s1.toCharArray();
        Arrays.sort(arr);

        String sorted = new String(arr);

        int i = 0;
        int j = s1.length()-1;

        while(j<n){
            String temp = s2.substring(i,j+1);
            char[] tempArr = temp.toCharArray();
            Arrays.sort(tempArr);
            String srtd = new String(tempArr);

            if(sorted.equals(srtd)){
                return true;
            }
            i++;
            j++;

        }
        return false;
    }
}

//Approach 2

// import java.util.Arrays;
// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         int m = s1.length();
//         int n = s2.length();
//         int arr1[] = new int[26];
//         int arr2[] = new int[26];

//         for(int i = 0 ; i<m ; i++){
//             arr1[s1.charAt(i)-'a']++;
//         }
//         int i = 0 ;
//         int j = 0 ;

//         while(j<n){
//             arr2[s2.charAt(j)-'a']++;

//             if(j-i+1 > m){
//                 arr2[s2.charAt(i)-'a']--;
//                 i++;
//             }

//             if(Arrays.equals(arr1, arr2)){
//                 return true;
//             }
//             j++;
//         }
//         return false;
//     }
// }