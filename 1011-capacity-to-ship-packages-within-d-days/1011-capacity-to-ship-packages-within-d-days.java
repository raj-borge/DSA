class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=Arrays.stream(weights).max().getAsInt();
        int high=0;
        for(int w:weights){
            high+=w;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(haveCapacity(weights,mid,days)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public boolean haveCapacity(int[] weights,int cap,int day){
        int days=1;
        int totalweight=0;
        for(int w:weights){
            if(totalweight + w>cap){
                days++;
                totalweight=w;
            }
            else{
                totalweight+=w;
            }
        }
        return days<=day;
    }
}