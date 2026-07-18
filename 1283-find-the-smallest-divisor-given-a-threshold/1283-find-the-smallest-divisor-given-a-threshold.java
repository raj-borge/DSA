class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Arrays.stream(nums).max().getAsInt();

        while(low<=high){
            int mid=low+(high-low)/2;

            if(findDiv(nums,mid,threshold)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public boolean findDiv(int[] nums,int div,int threshold){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]+div-1)/div;
        }
        if(sum>threshold){
            return false;
        }
        return true;
    }
}