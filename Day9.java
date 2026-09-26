//leetcode 271. Encode and Decode Strings
import java.util.ArrayList;
import java.util.List;

class Solution {

    public String encode(String arr[]) {
     
         StringBuilder sb = new StringBuilder();
         
         for(String str : arr){
             sb.append(str.length());
             sb.append("#");
             sb.append(str);
         }
         
         return sb.toString();
    }

    public List<String> decode(String s) {
      
        
        ArrayList<String> result = new ArrayList<>();
        
        int i = 0;
        
        while(i<s.length()){
            int j = i;
            
            while(s.charAt(j) != '#'){
                j++;
            }
            
            int length = Integer.parseInt(s.substring(i,j));
            
            j++;
            
            String str = s.substring(j,j+length);
            
            result.add(str);
            
            i = j+length;
            
            
        }
        
        return result;
    }
}
