class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length) return -1;
        int low=Arrays.stream(bloomDay).min().getAsInt();
        int high=Arrays.stream(bloomDay).max().getAsInt();
        int ans=high;
        while(low<high){
            int mid=low+(high-low)/2;

            if(isPossible(bloomDay,m,k,mid)){
                ans=mid;
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] bloomDay, int m, int k, int day) {

    int bouquets = 0;
    int flowers = 0;

    for (int bloom : bloomDay) {

        if (bloom <= day) {
            flowers++;
        }
        else {
            bouquets += flowers / k;
            flowers = 0;
        }
    }

        bouquets += flowers / k;

        return bouquets >= m;
    }
}