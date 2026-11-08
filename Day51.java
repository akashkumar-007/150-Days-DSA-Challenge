/*
Leetcode Problem 875. Koko Eating Bananas
class Solution {
    private static boolean eatAllBanana(int[] piles, int h , int mid){
        int actualHour = 0;
        for(int i = 0 ; i<piles.length ; i++){
            actualHour+= (piles[i]/mid);
            if( (piles[i]%mid) != 0){
            actualHour++;
         }
        }

        
        if(actualHour<=h){
            return true;
        }

        return false;
    } 
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r =  Arrays.stream(piles).max().getAsInt();

        while(l<r){
         int   mid = (l+r)/2;
            if(eatAllBanana(piles,h,mid)){
                r = mid;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
}
*/