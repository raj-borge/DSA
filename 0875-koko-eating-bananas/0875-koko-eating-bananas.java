class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Arrays.stream(piles).max().getAsInt();
        int ans=high;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(canFinish(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public boolean canFinish(int[] piles,int h,int k){
        long hours=0;
        for(int pile:piles){
            hours+=pile/k;
            if(pile %k !=0) hours++;
        }
        return hours<=h;
    }
}