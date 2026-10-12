//leetcode 424. Longest Repeating Character Replacement

// Approach 1 : This will give TLE

// class Solution {
//     public int characterReplacement(String s, int k) {
//         int max = 0;
//         for(int  i = 0 ; i<s.length() ; i++){
//             int maxC = 0;
//             int count[] = new int[26];

//             for(int j = i ; j<s.length() ; j++){
//                 char c = s.charAt(j);
//                 count[c-'A']++;
//                 maxC = Math.max(maxC,count[c-'A']);

//                 int ops = (j-i+1);
//                 if(ops-maxC > k){
//                     break;
//                 }

//                 max = Math.max(max,ops);
//             }
//         }

//         return max;
//     }
// }

class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int i = 0;
        int j = 0;
        int maxC = 0;
        int count[] = new int[26];

        while(j<s.length()){
            char c = s.charAt(j);
                count[c-'A']++;
                maxC = Math.max(maxC,count[c-'A']);

                
                if(j-i+1-maxC > k){
                   while(j-i+1-maxC > k){
                    count[s.charAt(i)-'A']--;
                    i++;
                    maxC = 0;
                    for(int p = 0 ; p<26 ; p++){
                        maxC = Math.max(maxC,count[p]);
                    }
                   }
                }

                max = Math.max(max,j-i+1);
                j++;
        }
       

        return max;
    }
}