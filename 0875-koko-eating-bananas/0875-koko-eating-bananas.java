class Solution {
    private long calculateTotalHours(int[] piles,int speed){
        long totalHrs=0;
        for(int bananas:piles){
            totalHrs+=(int)Math.ceil((double)bananas/speed);
        }
        return totalHrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile=Arrays.stream(piles).max().getAsInt();
        int low=1;
        int high=maxPile;
        int ans=maxPile;
        while(low<=high){
            int mid=low+(high-low)/2;
            long time=calculateTotalHours(piles,mid);

            if(time<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}