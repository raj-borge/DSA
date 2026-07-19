class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int low=-1;
        int high=0;

        if(n<k) return -1;
        for(int num:nums){
            low=Math.max(low,num);
            high+=num;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int count=1;
            int sum=0;

            for(int num:nums){
                if(sum+num>mid){
                    count++;
                    sum=0;
                }
                sum+=num;
            }
            if(count>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}